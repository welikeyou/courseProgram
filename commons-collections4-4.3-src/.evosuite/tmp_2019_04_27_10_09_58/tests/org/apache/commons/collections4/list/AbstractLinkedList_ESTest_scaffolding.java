/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sat Apr 27 02:53:33 GMT 2019
 */

package org.apache.commons.collections4.list;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class AbstractLinkedList_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.collections4.list.AbstractLinkedList"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "GBK"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\Dell\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "CN"); 
    java.lang.System.setProperty("user.dir", "D:\\myProjects\\courseProgram\\commons-collections4-4.3-src"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Dell"); 
    java.lang.System.setProperty("user.language", "zh"); 
    java.lang.System.setProperty("user.name", "Dell"); 
    java.lang.System.setProperty("user.timezone", "Asia/Shanghai"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractLinkedList_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.collections4.list.AbstractLinkedList$Node",
      "org.apache.commons.collections4.list.AbstractLinkedList",
      "org.apache.commons.collections4.list.AbstractLinkedList$LinkedSubListIterator",
      "org.apache.commons.collections4.list.CursorableLinkedList",
      "org.apache.commons.collections4.list.NodeCachingLinkedList",
      "org.apache.commons.collections4.list.AbstractLinkedList$LinkedSubList",
      "org.apache.commons.collections4.list.AbstractLinkedList$LinkedListIterator",
      "org.apache.commons.collections4.list.CursorableLinkedList$Cursor",
      "org.apache.commons.collections4.list.CursorableLinkedList$SubCursor",
      "org.apache.commons.collections4.OrderedIterator"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Comparator", false, AbstractLinkedList_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.function.Consumer", false, AbstractLinkedList_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractLinkedList_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.collections4.list.AbstractLinkedList",
      "org.apache.commons.collections4.list.AbstractLinkedList$Node",
      "org.apache.commons.collections4.list.AbstractLinkedList$LinkedListIterator",
      "org.apache.commons.collections4.list.AbstractLinkedList$LinkedSubList",
      "org.apache.commons.collections4.list.AbstractLinkedList$LinkedSubListIterator",
      "org.apache.commons.collections4.list.NodeCachingLinkedList",
      "org.apache.commons.collections4.list.CursorableLinkedList",
      "org.apache.commons.collections4.list.CursorableLinkedList$Cursor",
      "org.apache.commons.collections4.list.CursorableLinkedList$SubCursor"
    );
  }
}
