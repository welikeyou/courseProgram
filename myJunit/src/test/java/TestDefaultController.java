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

import org.junit.Test;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;


/**
 * Test-case for the default controller.
 */
public class TestDefaultController
{
    private DefaultController controller;

    private Request request;

    private RequestHandler handler;

    @Before
    public void initialize()
        throws Exception
    {
        //初始化测试对象
        controller = new DefaultController();
        request = new SampleRequest();
        handler = new SampleHandler();

        controller.addHandler( request, handler );
    }

    @Test
    public void testAddHandler()
    {
        Request request1=new SampleRequest("Test1");
        controller.addHandler(request1,handler);

    }

    @Test(timeout = 1)
    public void testProcessRequest()
    {
        Request request1=new SampleRequest();
       controller.processRequest(request1);
//        controller.addHandler(request1,handler);
    }

    @Test
    public void testProcessRequestAnswersErrorResponse() //测试异常处理
    {
        Request request1=new SampleRequest("Test1");
        assertTrue( controller.processRequest(request1) instanceof ErrorResponse);
        ;
    }

    @Test( expected = RuntimeException.class )
    public void testGetHandlerNotDefined()
    {
        //TODO 验证未注册的request对象会抛出RuntimeException异常
        Request request1=new SampleRequest("Test1");
        controller.processRequest(request1);
    }

    @Test( expected = RuntimeException.class )
    public void testAddRequestDuplicateName()
    {
        //TODO 验证注册重名请求时会抛出RuntimeException异常
        controller.addHandler(request,handler);
    }


    private class SampleRequest
        implements Request
    {
        private static final String DEFAULT_NAME = "Test";

        private String name;

        public SampleRequest( String name )
        {
            this.name = name;
        }

        public SampleRequest()
        {
            this( DEFAULT_NAME );
        }

        public String getName()
        {
            return this.name;
        }
    }

    private class SampleExceptionHandler
        implements RequestHandler
    {
        public Response process( Request request )
            throws Exception
        {
            throw new Exception( "error processing request" );
        }
    }

    private class SampleResponse
        implements Response
    {
        private static final String DEFAULT_NAME = "Test";

        private String name;

        public String getName()
        {
            return this.name;
        }

        public SampleResponse( String name )
        {
            this.name = name;
        }

        public SampleResponse()
        {
            this( DEFAULT_NAME );
        }

        public boolean equals( Object object ) //用来验证返回的Response对象的类型
        {
            boolean result = false;
            if ( object instanceof SampleResponse )
            {
                result = ( (SampleResponse) object ).getName().equals( getName() );
            }
            return result;
        }

        public int hashCode()
        {
            return this.name.hashCode();
        }
    }

    private class SampleHandler
        implements RequestHandler
    {
        public Response process( Request request )
            throws Exception
        {
            return new SampleResponse();
        }
    }
}
