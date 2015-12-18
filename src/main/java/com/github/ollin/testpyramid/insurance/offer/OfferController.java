package com.github.ollin.testpyramid.insurance.offer;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import com.github.ollin.testpyramid.insurance.proposal.ProposalsRepository;
import com.github.ollin.testpyramid.insurance.times.ValidUntilCalculator;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OfferController {

    private final ProposalsRepository proposalsRepository;
    private final OfferCreationDefault offerCreation;

    @Autowired
    public OfferController(ProposalsRepository proposalsRepository) {
        this(proposalsRepository, new OfferCreationDefault(new ValidUntilCalculator()));
    }
    public OfferController(ProposalsRepository proposalsRepository, OfferCreationDefault offerCreation) {
        this.proposalsRepository = proposalsRepository;
        this.offerCreation = offerCreation;
    }

    @RequestMapping(path = "/offer", method = GET)
    public String proposals() {
        return "offer";
    }

    @RequestMapping(value = "/offer", method = POST)
    public String greetingSubmit(@ModelAttribute ProposalId proposalId, Model model) {

        Proposal proposal = proposalsRepository.getById(proposalId.getId());

        model.addAttribute("offer", offerCreation.createOffer(
            new Actor() {},
            proposal)
        );

        return "offer";
    }

    public static class ProposalId {
        @Getter @Setter private int id;
    }
}
