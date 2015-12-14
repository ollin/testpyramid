package com.github.ollin.testpyramid.insurance.proposal;

import com.github.ollin.testpyramid.insurance.offer.Proposal;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class ProposalsRepository {

    private final HashMap<Integer, Proposal> proposals = new HashMap<>();

    public ProposalsRepository() {
        proposals.put(1, createProposalFor(1, "Pedro Almodóvar"));
        proposals.put(2, createProposalFor(2, "David Lynch"));
        proposals.put(3, createProposalFor(3, "Ridley Scott"));
    }

    public List<Proposal> findAll() {
        return new ArrayList<>(proposals.values());
    }

    public Proposal getById(int id) {
        return proposals.get(id);
    }

    private ProposalForIndividual createProposalFor(int id, String customerName) {
        ProposalForIndividual proposalForIndividual = new ProposalForIndividual(id);
        proposalForIndividual.setCustomerName(customerName);
        return proposalForIndividual;
    }

}
