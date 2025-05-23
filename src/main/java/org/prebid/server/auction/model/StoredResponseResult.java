package org.prebid.server.auction.model;

import com.iab.openrtb.request.Imp;
import com.iab.openrtb.response.SeatBid;
import lombok.Value;

import java.util.List;
import java.util.Map;

@Value(staticConstructor = "of")
public class StoredResponseResult {

    List<Imp> requiredRequestImps;

    List<SeatBid> auctionStoredResponse;

    Map<String, Map<String, String>> impBidderToStoredBidResponse;
}
