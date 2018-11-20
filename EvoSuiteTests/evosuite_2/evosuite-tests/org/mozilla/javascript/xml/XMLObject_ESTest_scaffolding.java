/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Aug 01 07:49:40 GMT 2018
 */

package org.mozilla.javascript.xml;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class XMLObject_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mozilla.javascript.xml.XMLObject"; 
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
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
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
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(XMLObject_ESTest_scaffolding.class.getClassLoader() ,
      "org.mozilla.javascript.EcmaError",
      "org.mozilla.javascript.SlotMapContainer",
      "org.mozilla.javascript.SymbolScriptable",
      "org.mozilla.javascript.xml.XMLObject",
      "org.mozilla.javascript.Symbol",
      "org.mozilla.javascript.Callable",
      "org.mozilla.javascript.RhinoException",
      "org.mozilla.javascript.ExternalArrayData",
      "org.mozilla.javascript.NativeObject",
      "org.mozilla.javascript.IdFunctionCall",
      "org.mozilla.javascript.IdFunctionObject",
      "org.mozilla.javascript.Function",
      "org.mozilla.javascript.SlotMap",
      "org.mozilla.javascript.IdScriptableObject",
      "org.mozilla.javascript.Context",
      "org.mozilla.javascript.ConstProperties",
      "org.mozilla.javascript.EvaluatorException",
      "org.mozilla.javascript.JavaScriptException",
      "org.mozilla.javascript.FunctionObject",
      "org.mozilla.javascript.IdFunctionObjectES6",
      "org.mozilla.javascript.ThreadSafeSlotMapContainer",
      "org.mozilla.javascript.ScriptableObject$KeyComparator",
      "org.mozilla.javascript.Scriptable",
      "org.mozilla.javascript.ScriptableObject",
      "org.mozilla.javascript.debug.DebuggableObject",
      "org.mozilla.javascript.BaseFunction"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(XMLObject_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mozilla.javascript.ScriptableObject$KeyComparator",
      "org.mozilla.javascript.ScriptableObject",
      "org.mozilla.javascript.IdScriptableObject",
      "org.mozilla.javascript.xml.XMLObject",
      "org.mozilla.javascript.UniqueTag",
      "org.mozilla.javascript.Scriptable"
    );
  }
}
