/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Aug 01 14:23:04 GMT 2018
 */

package org.mozilla.javascript.xmlimpl;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class XmlNode_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.mozilla.javascript.xmlimpl.XmlNode"; 
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
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/mmotwani/rhino/buildGradle/libs/evosuite_3"); 
    java.lang.System.setProperty("user.home", "/home/mmotwani"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "mmotwani"); 
    java.lang.System.setProperty("user.timezone", "America/New_York"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(XmlNode_ESTest_scaffolding.class.getClassLoader() ,
      "org.mozilla.javascript.NativeBoolean",
      "org.mozilla.javascript.ast.ScriptNode",
      "org.mozilla.javascript.typedarrays.NativeFloat32Array",
      "org.mozilla.javascript.DefaultErrorReporter",
      "org.mozilla.javascript.ExternalArrayData",
      "org.mozilla.javascript.UniqueTag",
      "org.mozilla.javascript.NativeError",
      "org.mozilla.javascript.typedarrays.NativeTypedArrayView",
      "org.mozilla.javascript.ast.AstNode",
      "org.mozilla.javascript.SlotMap",
      "org.mozilla.javascript.debug.Debugger",
      "org.mozilla.javascript.Context$ClassShutterSetter",
      "org.mozilla.classfile.ConstantPool",
      "org.mozilla.javascript.xmlimpl.XmlNode$Filter",
      "org.mozilla.javascript.RegExpProxy",
      "org.mozilla.javascript.NativeWith",
      "org.mozilla.javascript.EmbeddedSlotMap$Iter",
      "org.mozilla.javascript.xmlimpl.XMLWithScope",
      "org.mozilla.javascript.NativeJSON",
      "org.mozilla.javascript.NativeGenerator",
      "org.mozilla.javascript.ObjArray",
      "org.mozilla.javascript.SymbolKey",
      "org.mozilla.javascript.ES6Iterator",
      "org.mozilla.javascript.EcmaError",
      "org.mozilla.javascript.ast.RegExpLiteral",
      "org.mozilla.javascript.NativeError$ProtoProps",
      "org.mozilla.javascript.NativeJavaPackage",
      "org.mozilla.javascript.NativeFunction",
      "org.mozilla.javascript.IdFunctionCall",
      "org.mozilla.javascript.xmlimpl.XMLLibImpl",
      "org.mozilla.javascript.NativeString",
      "org.mozilla.javascript.typedarrays.NativeArrayBuffer",
      "org.mozilla.javascript.NativeContinuation",
      "org.mozilla.javascript.NativeCallSite",
      "org.mozilla.javascript.ast.Scope",
      "org.mozilla.javascript.NativeMath",
      "org.mozilla.javascript.Interpreter$CallFrame",
      "org.mozilla.javascript.xmlimpl.XMLList",
      "org.mozilla.javascript.NativeJavaObject",
      "org.mozilla.javascript.JavaScriptException",
      "org.mozilla.javascript.ContinuationPending",
      "org.mozilla.classfile.ClassFileWriter$ClassFileFormatException",
      "org.mozilla.javascript.FunctionObject",
      "org.mozilla.javascript.LazilyLoadedCtor$1",
      "org.mozilla.javascript.InterfaceAdapter",
      "org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider",
      "org.mozilla.javascript.debug.DebuggableObject",
      "org.mozilla.javascript.regexp.REProgState",
      "org.mozilla.javascript.NativeIterator$WrappedJavaIterator",
      "org.mozilla.javascript.ObjToIntMap",
      "org.mozilla.javascript.ast.Comment",
      "org.mozilla.javascript.NativeArray$StringLikeComparator",
      "org.mozilla.javascript.ClassShutter",
      "org.mozilla.javascript.jdk15.VMBridge_jdk15",
      "org.mozilla.javascript.xmlimpl.XMLObjectImpl",
      "org.mozilla.javascript.ast.Symbol",
      "org.mozilla.javascript.xmlimpl.XmlNode$XmlNodeUserDataHandler",
      "org.mozilla.javascript.typedarrays.NativeUint8Array",
      "org.mozilla.javascript.v8dtoa.CachedPowers$CachedPower",
      "org.mozilla.javascript.xmlimpl.XMLName",
      "org.mozilla.javascript.ImporterTopLevel",
      "org.mozilla.javascript.jdk18.VMBridge_jdk18",
      "org.mozilla.javascript.ClassCache",
      "org.mozilla.javascript.xmlimpl.XmlNode$Filter$4",
      "org.mozilla.javascript.xmlimpl.XmlNode$Filter$3",
      "org.mozilla.javascript.xmlimpl.XmlNode$Filter$2",
      "org.mozilla.javascript.Icode",
      "org.mozilla.javascript.xmlimpl.XmlNode$Filter$1",
      "org.mozilla.javascript.xmlimpl.QName",
      "org.mozilla.javascript.xmlimpl.XmlNode$Filter$5",
      "org.mozilla.javascript.typedarrays.NativeUint16Array",
      "org.mozilla.javascript.regexp.REGlobalData",
      "org.mozilla.javascript.regexp.RECompiled",
      "org.mozilla.javascript.xmlimpl.XmlNode",
      "org.mozilla.javascript.LazilyLoadedCtor",
      "org.mozilla.javascript.JavaAdapter",
      "org.mozilla.javascript.typedarrays.NativeInt32Array",
      "org.mozilla.javascript.Scriptable",
      "org.mozilla.javascript.NativeJavaArray",
      "org.mozilla.javascript.v8dtoa.FastDtoa",
      "org.mozilla.javascript.regexp.GlobData",
      "org.mozilla.javascript.EmbeddedSlotMap$1",
      "org.mozilla.javascript.regexp.RECharSet",
      "org.mozilla.javascript.xmlimpl.XmlNode$Namespace",
      "org.mozilla.javascript.WrappedException",
      "org.mozilla.javascript.regexp.RegExpImpl",
      "org.mozilla.javascript.ScriptableObject$GetterSlot",
      "org.mozilla.javascript.InterpreterData",
      "org.mozilla.javascript.NativeCall",
      "org.mozilla.javascript.regexp.NativeRegExp",
      "org.mozilla.javascript.xml.XMLLib",
      "org.mozilla.javascript.Node$PropListItem",
      "org.mozilla.javascript.regexp.CompilerState",
      "org.mozilla.javascript.IdFunctionObjectES6",
      "org.mozilla.javascript.NativeGenerator$GeneratorClosedException",
      "org.mozilla.javascript.NativeNumber",
      "org.mozilla.javascript.json.JsonParser$ParseException",
      "org.mozilla.javascript.ObjToIntMap$Iterator",
      "org.mozilla.javascript.ScriptableObject",
      "org.mozilla.javascript.NativeGlobal",
      "org.mozilla.javascript.xmlimpl.XmlProcessor$RhinoSAXErrorHandler",
      "org.mozilla.javascript.v8dtoa.DoubleHelper",
      "org.mozilla.javascript.xmlimpl.XmlNode$InternalList",
      "org.mozilla.javascript.ast.NodeVisitor",
      "org.mozilla.javascript.ast.AstRoot",
      "org.mozilla.javascript.ContextListener",
      "org.mozilla.javascript.Interpreter",
      "org.mozilla.javascript.SymbolScriptable",
      "org.mozilla.javascript.ScriptStackElement",
      "org.mozilla.javascript.NativeDate",
      "org.mozilla.javascript.StackStyle",
      "org.mozilla.javascript.NativeSymbol",
      "org.mozilla.javascript.regexp.NativeRegExpCtor",
      "org.mozilla.javascript.ScriptableObject$SlotAccess",
      "org.mozilla.javascript.BoundFunction",
      "org.mozilla.javascript.Node",
      "org.mozilla.javascript.regexp.REBackTrackData",
      "org.mozilla.javascript.xmlimpl.XMLCtor",
      "org.mozilla.javascript.Undefined$1",
      "org.mozilla.javascript.ContextFactory$Listener",
      "org.mozilla.javascript.IdScriptableObject$PrototypeValues",
      "org.mozilla.javascript.ContextFactory",
      "org.mozilla.javascript.GeneratedClassLoader",
      "org.mozilla.javascript.Script",
      "org.mozilla.javascript.ScriptRuntime$MessageProvider",
      "org.mozilla.javascript.typedarrays.NativeFloat64Array",
      "org.mozilla.javascript.ThreadSafeSlotMapContainer",
      "org.mozilla.javascript.Undefined",
      "org.mozilla.javascript.EmbeddedSlotMap",
      "org.mozilla.javascript.Wrapper",
      "org.mozilla.javascript.ScriptRuntime$NoSuchMethodShim",
      "org.mozilla.javascript.BaseFunction",
      "org.mozilla.classfile.ClassFileWriter$MHandle",
      "org.mozilla.javascript.ScriptRuntime",
      "org.mozilla.javascript.InterpretedFunction",
      "org.mozilla.javascript.JavaMembers",
      "org.mozilla.javascript.Ref",
      "org.mozilla.javascript.Callable",
      "org.mozilla.javascript.NativeJSON$StringifyState",
      "org.mozilla.javascript.NativeObject",
      "org.mozilla.javascript.typedarrays.NativeInt8Array",
      "org.mozilla.javascript.v8dtoa.FastDtoaBuilder",
      "org.mozilla.javascript.v8dtoa.CachedPowers",
      "org.mozilla.classfile.ExceptionTableEntry",
      "org.mozilla.javascript.IdFunctionObject",
      "org.mozilla.javascript.Function",
      "org.mozilla.javascript.xmlimpl.XmlProcessor",
      "org.mozilla.javascript.optimizer.OptFunctionNode",
      "org.mozilla.javascript.Context",
      "org.mozilla.javascript.JavaMembers$MethodSignature",
      "org.mozilla.javascript.EvaluatorException",
      "org.mozilla.javascript.NativeJavaClass",
      "org.mozilla.javascript.xmlimpl.XmlNode$QName",
      "org.mozilla.javascript.UintMap",
      "org.mozilla.javascript.ScriptableObject$KeyComparator",
      "org.mozilla.javascript.ContextFactory$GlobalSetter",
      "org.mozilla.javascript.debug.DebugFrame",
      "org.mozilla.javascript.regexp.SubString",
      "org.mozilla.javascript.NativeStringIterator",
      "org.mozilla.javascript.Evaluator",
      "org.mozilla.javascript.ast.FunctionNode",
      "org.mozilla.javascript.TopLevel$NativeErrors",
      "org.mozilla.javascript.SlotMapContainer",
      "org.mozilla.javascript.Symbol",
      "org.mozilla.javascript.Kit",
      "org.mozilla.javascript.typedarrays.NativeInt16Array",
      "org.mozilla.javascript.Token$CommentType",
      "org.mozilla.javascript.ScriptableObject$Slot",
      "org.mozilla.javascript.RhinoException",
      "org.mozilla.javascript.typedarrays.NativeUint8ClampedArray",
      "org.mozilla.javascript.typedarrays.ByteIo",
      "org.mozilla.javascript.ast.NumberLiteral",
      "org.mozilla.javascript.debug.DebuggableScript",
      "org.mozilla.javascript.Synchronizer",
      "org.mozilla.javascript.IdScriptableObject",
      "org.mozilla.javascript.NativeArray",
      "org.mozilla.javascript.optimizer.Codegen",
      "org.mozilla.javascript.VMBridge",
      "org.mozilla.javascript.regexp.RENode",
      "org.mozilla.javascript.ScriptRuntime$1",
      "org.mozilla.classfile.ClassFileWriter",
      "org.mozilla.javascript.NativeArrayIterator",
      "org.mozilla.javascript.ast.Jump",
      "org.mozilla.javascript.xmlimpl.XmlNode$Namespaces",
      "org.mozilla.javascript.TopLevel",
      "org.mozilla.javascript.NativeIterator$StopIteration",
      "org.mozilla.javascript.MemberBox",
      "org.mozilla.javascript.xml.XMLObject",
      "org.mozilla.javascript.Interpreter$GeneratorState",
      "org.mozilla.javascript.Delegator",
      "org.mozilla.javascript.ScriptRuntime$IdEnumeration",
      "org.mozilla.javascript.NativeJavaMethod",
      "org.mozilla.javascript.xmlimpl.XML",
      "org.mozilla.javascript.ast.Name",
      "org.mozilla.javascript.typedarrays.NativeUint32Array",
      "org.mozilla.javascript.xmlimpl.Namespace",
      "org.mozilla.javascript.BeanProperty",
      "org.mozilla.javascript.xml.XMLLib$Factory",
      "org.mozilla.javascript.NativeScript",
      "org.mozilla.javascript.SecurityController",
      "org.mozilla.javascript.ConstProperties",
      "org.mozilla.javascript.TopLevel$Builtins",
      "org.mozilla.javascript.NativeArray$ElementComparator",
      "org.mozilla.javascript.WrapFactory",
      "org.mozilla.javascript.NativeIterator",
      "org.mozilla.javascript.v8dtoa.DiyFp",
      "org.mozilla.javascript.ErrorReporter",
      "org.mozilla.javascript.CompilerEnvirons",
      "org.mozilla.javascript.typedarrays.NativeArrayBufferView",
      "org.mozilla.javascript.ContextAction",
      "org.mozilla.javascript.xml.XMLLib$Factory$1"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("org.mozilla.javascript.xmlimpl.XMLLibImpl", false, XmlNode_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(XmlNode_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.mozilla.javascript.xmlimpl.XmlNode",
      "org.mozilla.javascript.xmlimpl.XmlNode$XmlNodeUserDataHandler",
      "org.mozilla.javascript.xmlimpl.XmlNode$QName",
      "org.mozilla.javascript.xmlimpl.XmlNode$Namespace",
      "org.mozilla.javascript.xmlimpl.XmlNode$Namespaces",
      "org.mozilla.javascript.xmlimpl.XmlNode$Filter$1",
      "org.mozilla.javascript.xmlimpl.XmlNode$Filter$2",
      "org.mozilla.javascript.xmlimpl.XmlNode$Filter$4",
      "org.mozilla.javascript.xmlimpl.XmlNode$Filter$5",
      "org.mozilla.javascript.xmlimpl.XmlNode$Filter",
      "org.mozilla.javascript.xmlimpl.XmlNode$InternalList",
      "org.mozilla.javascript.xmlimpl.XmlProcessor",
      "org.mozilla.javascript.xmlimpl.XmlProcessor$RhinoSAXErrorHandler",
      "org.mozilla.javascript.xml.XMLLib",
      "org.mozilla.javascript.xmlimpl.XMLLibImpl",
      "org.mozilla.javascript.Ref",
      "org.mozilla.javascript.xmlimpl.XMLName",
      "org.mozilla.javascript.ScriptableObject$KeyComparator",
      "org.mozilla.javascript.ScriptableObject",
      "org.mozilla.javascript.IdScriptableObject",
      "org.mozilla.javascript.typedarrays.NativeArrayBufferView",
      "org.mozilla.javascript.typedarrays.NativeTypedArrayView",
      "org.mozilla.javascript.typedarrays.NativeInt8Array",
      "org.mozilla.javascript.Kit",
      "org.mozilla.javascript.ContextFactory",
      "org.mozilla.javascript.ScriptRuntime$DefaultMessageProvider",
      "org.mozilla.javascript.ScriptRuntime",
      "org.mozilla.javascript.optimizer.Codegen",
      "org.mozilla.javascript.Icode",
      "org.mozilla.javascript.Interpreter",
      "org.mozilla.javascript.Context",
      "org.mozilla.javascript.jdk15.VMBridge_jdk15",
      "org.mozilla.javascript.jdk18.VMBridge_jdk18",
      "org.mozilla.javascript.VMBridge",
      "org.mozilla.javascript.SlotMapContainer",
      "org.mozilla.javascript.EmbeddedSlotMap",
      "org.mozilla.javascript.typedarrays.NativeArrayBuffer",
      "org.mozilla.javascript.Undefined$1",
      "org.mozilla.javascript.UniqueTag",
      "org.mozilla.javascript.Scriptable",
      "org.mozilla.javascript.Undefined",
      "org.mozilla.javascript.StackStyle",
      "org.mozilla.javascript.RhinoException",
      "org.mozilla.javascript.EcmaError",
      "org.mozilla.javascript.typedarrays.NativeFloat64Array",
      "org.mozilla.javascript.xmlimpl.XmlNode$Filter$3",
      "org.mozilla.javascript.JavaAdapter",
      "org.mozilla.javascript.Delegator",
      "org.mozilla.javascript.xml.XMLObject",
      "org.mozilla.javascript.xmlimpl.XMLObjectImpl",
      "org.mozilla.javascript.xmlimpl.XMLList",
      "org.mozilla.javascript.xmlimpl.QName",
      "org.mozilla.javascript.xmlimpl.XML",
      "org.mozilla.javascript.typedarrays.NativeInt16Array",
      "org.mozilla.javascript.ClassCache",
      "org.mozilla.javascript.BaseFunction",
      "org.mozilla.javascript.TopLevel",
      "org.mozilla.javascript.IdScriptableObject$PrototypeValues",
      "org.mozilla.javascript.IdFunctionObject",
      "org.mozilla.javascript.EmbeddedSlotMap$Iter",
      "org.mozilla.javascript.ScriptableObject$SlotAccess",
      "org.mozilla.javascript.ScriptableObject$Slot",
      "org.mozilla.javascript.EmbeddedSlotMap$1",
      "org.mozilla.javascript.NativeObject",
      "org.mozilla.javascript.NativeError",
      "org.mozilla.javascript.NativeError$ProtoProps",
      "org.mozilla.javascript.MemberBox",
      "org.mozilla.javascript.ScriptableObject$GetterSlot",
      "org.mozilla.javascript.NativeCallSite",
      "org.mozilla.javascript.NativeGlobal",
      "org.mozilla.javascript.TopLevel$NativeErrors",
      "org.mozilla.javascript.NativeArray$StringLikeComparator",
      "org.mozilla.javascript.NativeArray$ElementComparator",
      "org.mozilla.javascript.NativeArray",
      "org.mozilla.javascript.NativeString",
      "org.mozilla.javascript.NativeBoolean",
      "org.mozilla.javascript.NativeNumber",
      "org.mozilla.javascript.NativeDate",
      "org.mozilla.javascript.NativeMath",
      "org.mozilla.javascript.NativeJSON",
      "org.mozilla.javascript.NativeWith",
      "org.mozilla.javascript.NativeCall",
      "org.mozilla.javascript.NativeScript",
      "org.mozilla.javascript.NativeIterator",
      "org.mozilla.javascript.NativeGenerator",
      "org.mozilla.javascript.NativeIterator$StopIteration",
      "org.mozilla.javascript.ES6Iterator",
      "org.mozilla.javascript.NativeArrayIterator",
      "org.mozilla.javascript.NativeStringIterator",
      "org.mozilla.javascript.xml.XMLLib$Factory",
      "org.mozilla.javascript.xml.XMLLib$Factory$1",
      "org.mozilla.javascript.LazilyLoadedCtor",
      "org.mozilla.javascript.typedarrays.NativeFloat32Array",
      "org.mozilla.javascript.typedarrays.NativeUint8ClampedArray",
      "org.mozilla.javascript.FunctionObject",
      "org.mozilla.javascript.typedarrays.NativeInt32Array",
      "org.mozilla.javascript.DefaultErrorReporter",
      "org.mozilla.javascript.EvaluatorException",
      "org.mozilla.javascript.typedarrays.NativeUint32Array",
      "org.mozilla.javascript.NativeJavaObject",
      "org.mozilla.javascript.NativeJavaArray",
      "org.mozilla.javascript.JavaMembers",
      "org.mozilla.javascript.NativeContinuation",
      "org.mozilla.javascript.SymbolKey",
      "org.mozilla.javascript.WrapFactory",
      "org.mozilla.javascript.typedarrays.NativeUint8Array",
      "org.mozilla.javascript.NativeJavaClass",
      "org.mozilla.javascript.ImporterTopLevel",
      "org.mozilla.javascript.ObjArray",
      "org.mozilla.javascript.LazilyLoadedCtor$1",
      "org.mozilla.javascript.regexp.NativeRegExp",
      "org.mozilla.javascript.regexp.RECompiled",
      "org.mozilla.javascript.regexp.CompilerState",
      "org.mozilla.javascript.regexp.RENode",
      "org.mozilla.javascript.regexp.NativeRegExpCtor",
      "org.mozilla.javascript.typedarrays.NativeUint16Array",
      "org.mozilla.javascript.BoundFunction",
      "org.mozilla.javascript.ScriptRuntime$1",
      "org.mozilla.javascript.JavaMembers$MethodSignature",
      "org.mozilla.javascript.NativeJavaMethod",
      "org.mozilla.javascript.BeanProperty",
      "org.mozilla.javascript.SecurityController",
      "org.mozilla.javascript.v8dtoa.FastDtoa",
      "org.mozilla.javascript.v8dtoa.FastDtoaBuilder",
      "org.mozilla.javascript.v8dtoa.DoubleHelper",
      "org.mozilla.javascript.v8dtoa.DiyFp",
      "org.mozilla.javascript.v8dtoa.CachedPowers$CachedPower",
      "org.mozilla.javascript.v8dtoa.CachedPowers",
      "org.mozilla.javascript.Synchronizer",
      "org.mozilla.javascript.NativeFunction",
      "org.mozilla.javascript.typedarrays.ByteIo",
      "org.mozilla.javascript.NativeSymbol"
    );
  }
}
