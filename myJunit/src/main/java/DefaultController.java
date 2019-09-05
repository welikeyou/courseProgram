/*
 * ========================================================================
 *
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * ========================================================================
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Map.Entry;

/**
 * Default implementation of the controller.
 */
public class DefaultController implements Controller {
    private List<Entry<String, RequestHandler>> requestHandlers = new ArrayList<Entry<String, RequestHandler>>();


    protected RequestHandler getHandler(Request request) {
        for (Entry<String, RequestHandler> entry : requestHandlers) {
            if (entry.getKey() == request.getName())
                return entry.getValue();
        }
        String message = "Cannot find handler for request name " + "["
                + request.getName() + "]";
        throw new RuntimeException(message);
    }

    public Response processRequest(Request request) {
        Response response;
        try {
            response = getHandler(request).process(request);
        } catch (Exception exception) {
            response = new ErrorResponse(request, exception);

        }
        return response;
    }

    public void addHandler(Request request, RequestHandler requestHandler) {
        for (Entry<String, RequestHandler> entry : requestHandlers) {
            if (entry.getKey() == request.getName())
                throw new RuntimeException("A request handler has "
                        + "already been registered for request name " + "["
                        + request.getName() + "]");
        }

        requestHandlers.add(new RequestEntry<String, RequestHandler>(request.getName(), requestHandler));
    }

    final private class RequestEntry<K, V> implements Entry<K, V> {
        private final K key;
        private V value;

        public RequestEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

//        @Override
        public K getKey() {
            return key;
        }

//        @Override
        public V getValue() {
            return value;
        }

//        @Override
        public V setValue(V value) {
            V old = this.value;
            this.value = value;
            return old;
        }
    }
}
