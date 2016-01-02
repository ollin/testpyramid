package com.github.ollin.testpyramid.insurance.proposal;

import static java.util.stream.Collectors.toList;

import com.github.ollin.testpyramid.insurance.offer.Proposal;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 *
 */
public class ProposalRow {

    @Getter @Setter int id;

    public ProposalRow() {
    }

    public ProposalRow(int id) {
        this.id = id;
    }

    public static List<ProposalRow> asRows(List<Proposal> proposalList) {
        return proposalList.stream().map(ProposalRow::asRow).collect(toList());
    }

    public static ProposalRow asRow(Proposal proposal) {
        return new ProposalRow(proposal.getId());
    }
}
