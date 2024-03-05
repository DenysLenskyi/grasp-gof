package com.foxminded.patterns.behavioral.mediator;

import com.foxminded.patterns.behavioral.mediator.concierge.ConciergeService;

import java.util.List;

public interface ConciergeMediator {
        List<ConciergeService> notify(ConciergeService activeService, List<ConciergeService> services);
}
