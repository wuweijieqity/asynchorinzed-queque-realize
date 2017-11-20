package com.nowcoder.async;

import java.util.List;

/**
 * Created by weijie on 2017/10/16.
 */
public interface EventHandler {
    void doHandle(EventModel model);
    List<EventType> getSupportEventTypes();
}
