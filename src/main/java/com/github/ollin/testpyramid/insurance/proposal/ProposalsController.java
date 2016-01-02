package com.github.ollin.testpyramid.insurance.proposal;

import static com.github.ollin.testpyramid.insurance.proposal.ProposalRow.asRow;
import static com.github.ollin.testpyramid.insurance.proposal.ProposalRow.asRows;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ProposalsController {

    private final ProposalsRepository proposalsRepository;

    @Autowired
    public ProposalsController(ProposalsRepository proposalsRepository){
        this.proposalsRepository = proposalsRepository;
    }

    @RequestMapping(path = "/proposals", method = RequestMethod.GET)
    public String proposals(Model model) {

        model.addAttribute("proposals", asRows(proposalsRepository.findAll()));

        return "proposals";
    }


    @RequestMapping(path = "/proposals/{id}", method = RequestMethod.GET)
    public String proposalPerId(@PathVariable int id, Model model) {

        model.addAttribute("proposalRow", asRow(proposalsRepository.getById(id)));

        return "proposal";
    }
}
