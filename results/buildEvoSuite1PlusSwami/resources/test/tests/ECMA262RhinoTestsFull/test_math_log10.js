/*
* This file is automatically generated by GenTest
*
* 2018-08-06 15:08:53.695849
*/




startTest();

/*
*
*	ABSTRACT FUNCTIONS IMPLEMENTED USING DESCRIPTION FROM ECMA-262 
*
*/

function RequireObjectCoercible(argument){
        if (argument == undefined || argument == null)
                throw new TypeError("TypeError in RequireObjectCoercible")
        else
                return argument
}

function ToString(argument){
        if (argument == undefined)
                return "undefined"
        else if(argument == null)
                return "null"
        else if(typeof argument == "boolean"){
                if (argument == true)
                        return "true"
                else
                        return "false"

        }
        else if(typeof argument == "string")
                return argument
        else if(typeof argument == "number")
                return Number(argument).toString()
        else if(typeof argument == "symbol")
                throw new TypeError("TypeError in ToString")
        else if(typeof argument == "object")
                return argument.toString()

}

function ToInteger(argument){
        var number = Number(argument)
        if (Object.is(number, NaN)){
                return 0
        }
        if (number == 0 || number == Infinity || number == -Infinity || number == +0 || number== -0){
                return number
        }
        return number-(number%1)
}

function ToUint32(argument){
        var number = Number(argument)
        if (Object.is(number, NaN) || number == 0 || number == Infinity || number == -Infinity || number == +0 || number== -0){
                return 0
        }
        var i = Math.floor(Math.abs(number))
        var int32bit = i%(Math.pow(2,32))
    return int32bit
}

function IsRegExp(argument){
        return (argument instanceof RegExp)
}

function IsCallable(argument){
        if (typeof argument != 'object')
                return false
        if (typeof argument == 'function')
                return true
        return false
}

function ToLength(argument){
        var len = ToInteger(argument);
        if (len <= 0)
                return 0
        return Math.min(len, 2e53-1)
}

function ToObject(argument){
        if (argument == undefined || argument == null)
                throw new TypeError("TypeError in ToObject")
        if (typeof argument == "number")
                return new Number(argument)
        if (typeof argument == "string")
                return new String(argument)
        if (typeof argument == "boolean")
                return new Boolean(argument)
        if (typeof argument == "symbol")
                return new Symbol(argument)
        if (typeof argument == "object")
                return argument
}

function thisNumberValue(argument){
	return Number(argument)
}

function thisTimeValue(argument){
	return Date(argument)
}
/*TEST TEMPLATE GENERATED AUTOMATICALLY*/
function test_math_log10(x){
	if (Object.is( x,NaN)){
		var output = Math.log10(x);
		new TestCase("math_log10", "math_log10", NaN, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x < 0)){
		var output = Math.log10(x);
		new TestCase("math_log10", "math_log10", NaN, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x===0)){
		var output = Math.log10(x);
		new TestCase("math_log10", "math_log10", -Infinity, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x===-0)){
		var output = Math.log10(x);
		new TestCase("math_log10", "math_log10", -Infinity, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x===1)){
		var output = Math.log10(x);
		new TestCase("math_log10", "math_log10", 0, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x===Infinity)){
		var output = Math.log10(x);
		new TestCase("math_log10", "math_log10", Infinity, output);
		test();
		//console.log("Good Test")
		return
		}
	//console.log("OK Test")
}

/*TESTS GENERATED AUTOMATICALLY*/
test_math_log10(+0);
test_math_log10(-869);
test_math_log10(false);
test_math_log10("3JZQ6GS");
test_math_log10(null);
test_math_log10(1.2106088610399718e+308);
test_math_log10(NaN);
test_math_log10(1.609463173930912e+308);
test_math_log10(true);
test_math_log10("QEOH5MRHW");
test_math_log10("VV0BN3LWCP");
test_math_log10(1.1556683501047204e+308);
test_math_log10(-543);
test_math_log10(7.642045463013528e+307);
test_math_log10(234);
test_math_log10(undefined);
test_math_log10("8OLN8");
test_math_log10(2.843904864187213e+307);
test_math_log10("P30");
test_math_log10(8.887987012597237e+307);
test_math_log10(/(\w+)\s(\w+)/);
test_math_log10(-743);
test_math_log10(632);
test_math_log10(1.1922380480020067e+308);
test_math_log10(-577);
test_math_log10("Y9R");
test_math_log10(1.4343069167723186e+308);
test_math_log10("97IGPDMB");
test_math_log10(-889);
test_math_log10(Infinity);
test_math_log10(/[\u0400-\u04FF]+/g);
test_math_log10("PM51QKY4");
test_math_log10(4.555729830097629e+307);
test_math_log10(/foo/g);
test_math_log10(12);
test_math_log10(1.7376718119019819e+308);
test_math_log10("QX3PY5L");
test_math_log10("MMXG3J6GC");
test_math_log10(-925);
test_math_log10(-325);
test_math_log10(574);
test_math_log10(404);
test_math_log10(-713);
test_math_log10(-349);
test_math_log10(/ab+c/);
test_math_log10(1.430474422142599e+308);
test_math_log10("QKL");
test_math_log10(/[^.]+/);
test_math_log10(-0);
test_math_log10("GMXG2H");
test_math_log10(/yes.*day/);
test_math_log10(934);
test_math_log10(8.628959427913569e+307);
test_math_log10(1.393972378125582e+308);
test_math_log10(5.334551204304427e+307);
test_math_log10(-859);
test_math_log10(-991);
test_math_log10(2.577820717844647e+307);
test_math_log10(3.573775609150457e+307);
test_math_log10(-555);
test_math_log10("HU1");
test_math_log10("DR2TO0N3VN");
test_math_log10("Q6CT1QO");
test_math_log10("S730MH");
test_math_log10(4.2568317671150757e+306);
test_math_log10(1.1211534009318745e+308);
test_math_log10(894);
test_math_log10(-719);
test_math_log10(9.761478169480907e+307);
test_math_log10(1.374088297647724e+308);
test_math_log10("Y63Y");
test_math_log10("W5E74X0R");
test_math_log10(/\r\n|\r|\n/);
test_math_log10(7.697697309412467e+307);
test_math_log10(-461);
test_math_log10(136);
test_math_log10("CM3B43");
test_math_log10(1.3529233315415477e+307);
test_math_log10(1.741062389105476e+308);
test_math_log10(-625);
test_math_log10(8.434225899257914e+307);
test_math_log10("JBJ6S28XM");
test_math_log10(-701);
test_math_log10(4);
test_math_log10(60);
test_math_log10("G3U");
test_math_log10(3.2620380254202084e+307);
test_math_log10(9.847832477026677e+307);
test_math_log10("BUV0B6MM");
test_math_log10("ZAHKO7O");
test_math_log10(1.0851367704875599e+308);
test_math_log10(1.0612212302149166e+308);
test_math_log10(1.2691012355584719e+308);
test_math_log10(1.0718487600188803e+308);
test_math_log10("7VOSMH7Q");
test_math_log10(-587);
test_math_log10(/yes[^]*day/);
test_math_log10(64);
test_math_log10(2.9187479852418116e+307);
test_math_log10("YURCUA03N7");
test_math_log10(-629);
test_math_log10(-193);
test_math_log10(1.7880039786650698e+308);
test_math_log10(1.2395675604165778e+308);
test_math_log10(1.7051483318642618e+308);
test_math_log10(-519);
test_math_log10(-333);
test_math_log10("1234");
test_math_log10(1.3479185624481893e+306);
test_math_log10(-455);
test_math_log10(532);
test_math_log10(62);
test_math_log10("Z9M65U9D");
test_math_log10("OKN");
test_math_log10(3.221837981909409e+307);
test_math_log10(552);
test_math_log10("DQ8NRGVP");
test_math_log10(1.1086748851142842e+308);
test_math_log10(-159);
test_math_log10(5.644511507989865e+307);
test_math_log10("Y5YQN4");
test_math_log10(324);
test_math_log10(1.7742660134230754e+308);
test_math_log10("1Y66SC");
test_math_log10(1.710634941729079e+308);
test_math_log10(1.373644312450547e+308);
test_math_log10("4T5T9VN");
test_math_log10(954);
test_math_log10(1.6146916141304213e+308);
test_math_log10("XRGMY2XM");
test_math_log10(4.788239787022299e+307);
test_math_log10("WQHRC");
test_math_log10(1.4751179308524189e+308);
test_math_log10(1.7902711038151138e+308);
test_math_log10(1.7848472070304418e+308);
test_math_log10("398");
test_math_log10(5.058318965180428e+307);
test_math_log10(4.604608136599228e+307);
test_math_log10(1.609346120533053e+307);
test_math_log10("RB3V");
test_math_log10("Q8DAO4RML");
test_math_log10(2.3122673185076685e+307);
test_math_log10(-295);
test_math_log10("T1L5J0F");
test_math_log10(1.695234195947708e+308);
test_math_log10("Z4DO");
test_math_log10(-179);
test_math_log10(1.7668387724250143e+308);
test_math_log10("MDC9ICO379");
test_math_log10(5.585917705678821e+307);
test_math_log10(1.6210757521253885e+308);
test_math_log10(3.2086892971138134e+307);
test_math_log10(-31);
test_math_log10("WTQOXK961K");
test_math_log10("TLS");
test_math_log10("SRGQA3QM");
test_math_log10(-111);
test_math_log10(1.290458956633259e+308);
test_math_log10("5DP8FFA");
test_math_log10(3.13784055937211e+307);
test_math_log10("K2LE4WJEA");
test_math_log10(-41);
test_math_log10(5.854007743561755e+307);
test_math_log10(1.032434556394029e+308);
test_math_log10("3N1");
test_math_log10(1.1823531679616582e+308);
test_math_log10(1.5858177396560223e+308);
test_math_log10("EN95P");
test_math_log10(1.0081666058761628e+308);
test_math_log10(1.3844393183284064e+308);
test_math_log10("6TWRAQ0S");
test_math_log10(4.1977735376562443e+307);
test_math_log10(784);
test_math_log10("5MDPNR");
test_math_log10("3Q0GR71U");
test_math_log10(1.7229357162149839e+308);
test_math_log10("52L");
test_math_log10("T2QTD1ND");
test_math_log10(-771);
test_math_log10(1.1779715580727265e+308);
test_math_log10(-327);
test_math_log10(94);
test_math_log10("8EF6BO");
test_math_log10(1.1314252353313515e+308);
test_math_log10(1.0311513007715414e+308);
test_math_log10("WKEUHS");
test_math_log10("J2LJ");
test_math_log10("5TTJ0XKX");
test_math_log10(-169);
test_math_log10(-251);
test_math_log10(-537);
test_math_log10(1.0379930409956463e+308);
test_math_log10("3C5SDLQYRN");
test_math_log10(3.645547607089099e+307);
test_math_log10("CEY0MSF");
test_math_log10(8.466341792273072e+307);
test_math_log10(-903);
test_math_log10(1.2667092243938297e+307);
test_math_log10(6.557760630996911e+307);
test_math_log10("B5HARNB");
test_math_log10("N61SQSCFVP");
test_math_log10(1.6779372388156557e+308);
test_math_log10("XCGP");
test_math_log10(444);
test_math_log10("UM7Y");
test_math_log10(558);
test_math_log10("Y2XZC0YTEE");
test_math_log10("WLZ2");
test_math_log10(50);
test_math_log10(7.139627313705573e+307);
test_math_log10(3.82664834200003e+307);
test_math_log10(668);
test_math_log10(1.10109904386649e+308);
test_math_log10(1.556049577038836e+308);
test_math_log10(-963);
test_math_log10("019M");
test_math_log10(2.7974299401533703e+307);
test_math_log10("1346O");
test_math_log10(0x00111);
test_math_log10(-977);
test_math_log10("4YP");
test_math_log10(-161);
test_math_log10("OF1WX4UFTN");
test_math_log10("MK8EEEE8FL");
test_math_log10(524);
test_math_log10(1.04085211477353e+308);
test_math_log10(-441);
test_math_log10("1GNGG00SBM");
test_math_log10(648);
test_math_log10(5.147347013334411e+307);
test_math_log10(188);
test_math_log10(1.6656797180409002e+308);
test_math_log10(1.3014021493375822e+308);
test_math_log10("FCVR7Q7G");
test_math_log10(206);
test_math_log10("O0602");
test_math_log10("D9TY50P");
test_math_log10(-515);
test_math_log10(1.0474002910717313e+308);
test_math_log10(-263);
test_math_log10(1.358123445653156e+308);
test_math_log10(7.50495530903712e+307);
test_math_log10(-565);
test_math_log10("1PG7B");
test_math_log10("8OU3NSUP0G");
test_math_log10("2WF21X44L");
test_math_log10(1.7744329231320201e+308);
test_math_log10(2.5237861528660245e+307);
test_math_log10(-825);
test_math_log10(1.253609569176689e+305);
test_math_log10(-75);
test_math_log10("E72H");
test_math_log10(602);
test_math_log10(996);
test_math_log10(952);
test_math_log10(-971);
test_math_log10(1.3900593622248962e+308);
test_math_log10("JYQYL5");
test_math_log10("USQDXUR");
test_math_log10(2.7758677748079846e+307);
test_math_log10("UJGPMF");
test_math_log10("E48X2SOB8A");
test_math_log10("XZF313D");
test_math_log10("QWHGPP");
test_math_log10("K8FKR");
test_math_log10(1.6308772637117457e+308);
test_math_log10(1.5662938490424808e+308);
test_math_log10("3GU5Q");
test_math_log10(1.500581419649575e+308);
test_math_log10(-339);
test_math_log10(1.4420005434728143e+308);
test_math_log10("1Y98Q1H");
test_math_log10(-359);
test_math_log10("WFBBDO1G6A");
test_math_log10("JEEF");
test_math_log10(-615);
test_math_log10(2.584772395964346e+307);
test_math_log10(9.487766450668913e+307);
test_math_log10(1.6644128151561803e+307);
test_math_log10(-783);
test_math_log10(1.5228285585309372e+308);
test_math_log10("A1TK3KH1");
test_math_log10(1.5988416718570098e+308);
test_math_log10(120);
test_math_log10("BAFO");
test_math_log10(-367);
test_math_log10(-89);
test_math_log10(1.1366686659719508e+308);
test_math_log10(-95);
test_math_log10("ALHQX6RO");
test_math_log10(1.7861534662927304e+308);
test_math_log10(8);
test_math_log10(1.52938041958579e+308);
test_math_log10(1.5051125308119233e+308);
test_math_log10(962);
test_math_log10(180);
test_math_log10("1NZYATWUGK");
test_math_log10(2.080555746702048e+307);
test_math_log10(412);
test_math_log10(6.995955720001765e+307);
test_math_log10(1.5379439051457824e+308);
test_math_log10(-221);
test_math_log10("48P1U");
test_math_log10("UQHRMT7M7");
test_math_log10(3.3079400248669755e+307);
test_math_log10(1.4928190836134416e+308);
test_math_log10(298);
test_math_log10(124);
test_math_log10(-189);
test_math_log10(1.1489733563059144e+308);
test_math_log10(3.616314542550103e+306);
test_math_log10(8.23108176008384e+306);
test_math_log10("7W741");
test_math_log10("ZB2");
test_math_log10(-507);
test_math_log10(9.188189549210038e+307);
test_math_log10("R3ROB1GZ3");
test_math_log10(1.6045018096980277e+308);
test_math_log10(-605);
test_math_log10(3.336129639165203e+307);
test_math_log10(7.053925760514036e+307);
test_math_log10(1.6967386826121372e+308);
test_math_log10(4.576991085408823e+307);
test_math_log10(-505);
test_math_log10(-497);
test_math_log10(-791);
test_math_log10(-151);
test_math_log10("8KOHV7E4");
test_math_log10(1.6498018162790656e+307);
test_math_log10("8UZK7LB1K");
test_math_log10("8SOI588");
test_math_log10(1.6270849635835832e+308);
test_math_log10(6.574681350883269e+307);
test_math_log10(7.555540103310301e+307);
test_math_log10(1.458123265022847e+308);
test_math_log10(-939);
test_math_log10("ZQHEL8S3");
test_math_log10(-133);
test_math_log10(-373);
test_math_log10(5.65791984084732e+307);
test_math_log10(1.3651557769261658e+308);
test_math_log10(1.2191832305032185e+308);
test_math_log10(-335);
test_math_log10(1.3647932060607777e+308);
test_math_log10("LK6OD2");
test_math_log10(1.7264731994152315e+308);
test_math_log10(8.51623633262263e+307);
test_math_log10(1.4289736605400244e+308);
test_math_log10("29OEA");
test_math_log10(6.772545408086938e+307);
test_math_log10("5Q9O241T23");
test_math_log10(7.520201343243064e+307);
test_math_log10(1.0037083406073304e+308);
test_math_log10("HYW36");
test_math_log10(1.3431625045448083e+308);
test_math_log10(15);
test_math_log10(2.769005067589091e+307);
test_math_log10(408);
test_math_log10(622);
test_math_log10("A0F1NM23N3");
test_math_log10(5.73265385019515e+307);
test_math_log10(862);
test_math_log10(3.4626135144351973e+307);
test_math_log10("Q7L4A1KZM");
test_math_log10("W42JS19BP7");
test_math_log10(-683);
test_math_log10(-649);
test_math_log10("05X6O7QD");
test_math_log10("2KYD");
test_math_log10(-955);
test_math_log10(390);
test_math_log10("VWTP6WDWS");
test_math_log10(1.6881600459327132e+308);
test_math_log10("IHPE");
test_math_log10(7.65975044395494e+307);
test_math_log10("H2125ZFHS");
test_math_log10(1.3805652889486906e+308);
test_math_log10(-905);
test_math_log10(-69);
test_math_log10("E7QGIN");
test_math_log10("Z0C");
test_math_log10(-657);
test_math_log10(7.482835430488804e+307);
test_math_log10("DTA");
test_math_log10(1.4465874983277832e+308);
test_math_log10(-307);
test_math_log10("EAJ");
test_math_log10("64O68SF");
test_math_log10("6HWY2LA");
test_math_log10(760);
test_math_log10(162);
test_math_log10(826);
test_math_log10("NRHJNOBFQ");
test_math_log10(1.5597006107707642e+308);
test_math_log10("ZIG9YG");
test_math_log10(1.731404266819098e+308);
test_math_log10("K4QQS");
test_math_log10(1.4974223207687564e+308);
test_math_log10("SWW7B");
test_math_log10("3GE0");
test_math_log10(9.658289936823003e+307);
test_math_log10("S7AW6");
test_math_log10(2.4904291097553007e+307);
test_math_log10(2.3654337468656967e+307);
test_math_log10(30);
test_math_log10(1.4803589537227237e+308);
test_math_log10(-357);
test_math_log10(-419);
test_math_log10("8QB8VSIR");
test_math_log10(-447);
test_math_log10("ABDGQ");
test_math_log10(396);
test_math_log10(6.281426703016667e+307);
test_math_log10(1.2247555795457754e+308);
test_math_log10(8.161100986039294e+307);
test_math_log10("F4NZOA");
test_math_log10(896);
test_math_log10(264);
test_math_log10(-557);
test_math_log10("EQXAI5BTC7");
test_math_log10(8.014009985094467e+307);
test_math_log10(-329);
test_math_log10(-7);
test_math_log10(4.1376465835801284e+307);
test_math_log10("EEZVH2");
test_math_log10("TWN3DH58U");
test_math_log10(9.689437046898682e+307);
test_math_log10(240);
test_math_log10(6.512732414764592e+307);
test_math_log10("TUZFQFHDU");
test_math_log10("LNK");
test_math_log10(-931);
test_math_log10(4.073304286634555e+307);
test_math_log10("279");
test_math_log10(8.04120470577634e+307);
test_math_log10(-241);
test_math_log10("XU6W0");
test_math_log10(3.837660429992181e+306);
test_math_log10("WSO");
test_math_log10(3.2528048735280125e+307);
test_math_log10(5.604369883396726e+307);
test_math_log10("EXIF");
test_math_log10("4M0BSSP");
test_math_log10(6.29456926623094e+307);
test_math_log10("WXLER3");
test_math_log10(-611);
test_math_log10("YG6FE998ZN");
test_math_log10(-595);
test_math_log10(1.557245608200189e+308);
test_math_log10(1.6260334178079931e+308);
test_math_log10("PT4C");
test_math_log10("81G4TD167");
test_math_log10(566);
test_math_log10("8WMVWWXG");
test_math_log10(7.980265134788032e+307);
test_math_log10("K0QYFRQN");
test_math_log10(8.874301128277901e+307);
test_math_log10(-59);
test_math_log10(1.3859437836464115e+308);
test_math_log10("3NMUTDF");
test_math_log10("0LXOCRPW3");
test_math_log10("JR43I");
test_math_log10("Q70KD");
test_math_log10(3.422473438449246e+307);
test_math_log10("VUW5YWAABY");
test_math_log10(-171);
test_math_log10("I5PO");
test_math_log10("505Q");
test_math_log10("0K5CTLDY");
test_math_log10(-63);
test_math_log10(-891);
test_math_log10(3.8510349033368437e+307);
test_math_log10("ACYIES");
test_math_log10(-311);
test_math_log10(8.376288013163273e+307);
test_math_log10(-599);
test_math_log10(-639);
test_math_log10(9.352728838288697e+307);
test_math_log10("TM507K");
test_math_log10(4.1331072550185283e+307);
test_math_log10(2.0530395944593687e+307);
test_math_log10(-855);
test_math_log10(6.196768867355343e+307);
test_math_log10(1.7266647501765024e+308);
test_math_log10("HQGUMU");
test_math_log10(-917);
test_math_log10("48FPW4");
test_math_log10(1.6389932582748384e+308);
test_math_log10("EZZ77ROY");
test_math_log10(696);
test_math_log10(-321);
test_math_log10(-443);
test_math_log10(512);
test_math_log10(-957);
test_math_log10(1.7869379664754758e+308);
test_math_log10("5HXN6H1RTO");
test_math_log10("MO82CZM9");
test_math_log10(9.194596167815919e+307);
test_math_log10("G1X1GTKXI");
test_math_log10(1.468106479880434e+308);
test_math_log10(7.528315403482931e+307);
test_math_log10(740);
test_math_log10(-573);
test_math_log10(1.7146249673034532e+308);
test_math_log10(3.1793610403463406e+307);
test_math_log10("Y44KKT");
test_math_log10(-309);
test_math_log10(500);
test_math_log10(1.3109158923779175e+308);
test_math_log10(1.1082844247081635e+308);
test_math_log10("PM5");
test_math_log10("AFE144KW0");
test_math_log10("9TX");
test_math_log10(9.672193855907432e+307);
test_math_log10("Y3393Q6PUP");
test_math_log10("BJ7QSP");
test_math_log10(-283);
test_math_log10(682);
test_math_log10("5XY2TG8P1");
test_math_log10("PW3CD2E6");
test_math_log10("LVD6");
test_math_log10(6.491027875333978e+307);
test_math_log10("FXHAQ");
test_math_log10(1.3216654325289898e+308);
test_math_log10("DR2L4E3JO");
test_math_log10(2.6632010282739673e+307);
test_math_log10(9.210845025675227e+307);
test_math_log10("VSSP07");
test_math_log10(5.008882782092639e+307);
test_math_log10("B45IA");
test_math_log10("8L7S4EV");
test_math_log10(130);
test_math_log10(-709);
test_math_log10(2.647342278819682e+307);
test_math_log10(4.690100638878061e+307);
test_math_log10(-921);
test_math_log10(-545);
test_math_log10(-575);
test_math_log10(1.678232162585585e+307);
test_math_log10(5.602941947361849e+307);
test_math_log10(-217);
test_math_log10("8ZS6849RAY");
test_math_log10(7.148681817739435e+307);
test_math_log10(1.7842243586039878e+307);
test_math_log10("T8JGKOL14");
test_math_log10("1NB41RF");
test_math_log10("BQAZU12PXH");
test_math_log10(-205);
test_math_log10(-667);
test_math_log10(5.253799370920178e+307);
test_math_log10(2.4838787794692676e+307);
test_math_log10(-927);
test_math_log10("LX67BW");
test_math_log10(9.86423332402104e+307);
test_math_log10(9.404321596422815e+306);
test_math_log10(-363);
test_math_log10(362);
test_math_log10(1.1295926085609995e+308);
test_math_log10("1JV2");
test_math_log10(2.254551561477714e+307);
test_math_log10(224);
test_math_log10(1.3594451216946437e+308);
test_math_log10(876);
test_math_log10("IF30JD");
test_math_log10(480);
test_math_log10(-353);
test_math_log10("PRN");
test_math_log10(1.4890482603291402e+308);
test_math_log10(-47);
test_math_log10(-687);
test_math_log10(4.820870362161341e+307);
test_math_log10(9.077717573303227e+307);
test_math_log10(1.2668205433256253e+308);
test_math_log10(8.778367543643838e+307);
test_math_log10(-787);
test_math_log10(4.3133692709762647e+307);
test_math_log10("7JLY");
test_math_log10("94I6TK4");
test_math_log10("60QB6");
test_math_log10("7UPZ1");
test_math_log10("EKG");
test_math_log10("55H4UXB");
test_math_log10("S4CABPOG");
test_math_log10("1P0K6KX");
test_math_log10(1.066515055125729e+308);
test_math_log10(-737);
test_math_log10(1.4085717805655708e+308);
test_math_log10("9USSFX6VRX");
test_math_log10("KAOU");
test_math_log10(7.976115907024914e+307);
test_math_log10(5.988653419978617e+307);
test_math_log10("QKK86CDVGT");
test_math_log10(4.757257629078204e+306);
test_math_log10("7BAV");
test_math_log10(1.4208265048232271e+308);
test_math_log10("VB7");
test_math_log10(-255);
test_math_log10(-993);
test_math_log10("1ZZ3205GS");
test_math_log10(-235);
test_math_log10(6.783521941647744e+307);
test_math_log10("14F");
test_math_log10(3.0255214926633767e+307);
test_math_log10(-457);
test_math_log10(-77);
test_math_log10(-53);
test_math_log10("OJSJVWS7X");
test_math_log10(1.3748215514335227e+308);
test_math_log10(5.978651424590022e+307);
test_math_log10(-331);
test_math_log10("XKDF5MQ6");
test_math_log10(134);
test_math_log10("JLWVFA3I2H");
test_math_log10(-985);
test_math_log10(3.733690522578102e+306);
test_math_log10("4JCT");
test_math_log10(3.3926340276321305e+307);
test_math_log10(838);
test_math_log10("XOMOHHG7C");
test_math_log10(256);
test_math_log10(-149);
test_math_log10(-87);
test_math_log10(726);
test_math_log10(1.7178202652999188e+308);
test_math_log10(-237);
test_math_log10("8QLQJ4AG");
test_math_log10(1.4036712862106877e+307);
test_math_log10("H38GC9YI");
test_math_log10(1.7909642832011443e+308);
test_math_log10("NL9T8DEX");
test_math_log10(1.181320267169207e+308);
test_math_log10("00FEJXP");
test_math_log10(-57);
test_math_log10(3.7360999534201985e+306);
test_math_log10(-1);
test_math_log10(8.622731626003035e+307);
test_math_log10(1.0661616970259494e+308);
test_math_log10(816);
test_math_log10(1.7967871414906256e+308);
test_math_log10(1.610119303006191e+308);
test_math_log10(5.929554652580214e+307);
test_math_log10("GBE8L9LR9V");
test_math_log10("1TTL");
test_math_log10(1.0870001102835621e+308);
test_math_log10("Y00PR02SS");
test_math_log10(9.08286259831794e+307);
test_math_log10("QUZP");
test_math_log10(1.2747378036856447e+308);
test_math_log10(6.448010257430954e+307);
test_math_log10("KAJDSAT");
test_math_log10(1.5187205389783633e+308);
test_math_log10(496);
test_math_log10("SN9");
test_math_log10(-3);
test_math_log10("FIQ");
test_math_log10(802);
test_math_log10(-569);
test_math_log10(1.3353042417437734e+308);
test_math_log10(7.14330216111065e+307);
test_math_log10("5OG");
test_math_log10(1.3771003122837181e+308);
test_math_log10(-0xF1A7);
test_math_log10(-897);
test_math_log10(1.0756029129554799e+308);
test_math_log10(-473);
test_math_log10("EJD9N9D");
test_math_log10(1.0715259613098066e+308);
test_math_log10("TLY");
test_math_log10("8S3UPAKE");
test_math_log10(-553);
test_math_log10(-61);
test_math_log10("RM6E62D4JV");
test_math_log10(892);
test_math_log10(-831);
test_math_log10(-137);
test_math_log10(1.761599745807455e+308);
test_math_log10(1.480275459668217e+308);
test_math_log10(8.157024239411606e+306);
test_math_log10(5.1223452397771e+306);
test_math_log10(5.593850319635856e+307);
test_math_log10("M5K99GGN");
test_math_log10(276);
test_math_log10(458);
test_math_log10("ZW8K977");
test_math_log10(1.3822599323405254e+308);
test_math_log10("R1O7ZRVY9D");
test_math_log10("JYIRFS");
test_math_log10(774);
test_math_log10(316);
test_math_log10(1.6750600607524029e+308);
test_math_log10(1.175445410557103e+308);
test_math_log10("2VXK");
test_math_log10(1.9261788843757598e+306);
test_math_log10("4QHYGSVILX");
test_math_log10("Y91");
test_math_log10("9XYBCVQ8");
test_math_log10(4.827431811791601e+307);
test_math_log10(1.7871335380608528e+308);
test_math_log10("GB36PPWQ");
test_math_log10("76UZLQ6");
test_math_log10(2.7154628899834713e+306);
test_math_log10(4.2644240161454774e+306);
test_math_log10(-397);
test_math_log10("CZOY");
test_math_log10("N9ZQ");
test_math_log10("CPLB309OY");
test_math_log10(1.7124507714266599e+308);
test_math_log10("BZ1");
test_math_log10(-761);
test_math_log10("9H125G");
test_math_log10("BP53412WX");
test_math_log10("HYI26B01");
test_math_log10(1.7268781108923296e+308);
test_math_log10("VNPYID7BO");
test_math_log10(-213);
test_math_log10("25M");
test_math_log10(1.645596858384317e+308);
test_math_log10("EGCVVSIYU7");
test_math_log10(1.162246688829049e+308);
test_math_log10(1.163930269274203e+308);
test_math_log10(3.155426250474942e+307);
test_math_log10("OH70R6I");
test_math_log10(1.3167347179045026e+308);
test_math_log10(1.5559826037705625e+307);
test_math_log10(4.731226348279288e+307);
test_math_log10(-919);
test_math_log10(1.7533437015995957e+307);
test_math_log10("7JP8");
test_math_log10(3.0391423718375024e+307);
test_math_log10("CXTT3GGDP");
test_math_log10(-741);
test_math_log10("56S6");
test_math_log10(-809);
test_math_log10(3.204357775163545e+307);
test_math_log10(810);
test_math_log10("Z8E3MRZQ");
test_math_log10(1.2215001972819484e+308);
test_math_log10("LXT3I");
test_math_log10(1.0160480511141066e+308);
test_math_log10(798);
test_math_log10(9.83444022509439e+307);
test_math_log10(958);
test_math_log10("4UU");
test_math_log10(482);
test_math_log10("ND393V6Y");
test_math_log10(1.321127042494219e+307);
test_math_log10(-801);
test_math_log10(5.990047473195235e+307);
test_math_log10(-465);
test_math_log10("CP4QZR8I");
test_math_log10(1.588485271840786e+308);
test_math_log10(3.473802515858417e+307);
test_math_log10(1.1085933262211766e+308);
test_math_log10("5YR4");
test_math_log10(1.7759221353675292e+308);
test_math_log10("MGJXZ3TV");
test_math_log10(942);
test_math_log10(7.939283993431556e+307);
test_math_log10(38);
test_math_log10(1.4783249452078242e+307);
test_math_log10(554);
test_math_log10(1.1547226250656535e+308);
test_math_log10(2.2431036917542758e+306);
test_math_log10(28);
test_math_log10(1.4593280290765226e+308);
test_math_log10("MH7");
test_math_log10(1.1470605638739403e+308);
test_math_log10("ROHFBTCY");
test_math_log10("Z0RUO");
test_math_log10(3.097430381517911e+306);
test_math_log10("3FT8RN8");
test_math_log10(606);
test_math_log10(5.742892138744677e+307);
test_math_log10("8KYCFA");
test_math_log10(8.552099004126249e+307);
test_math_log10(808);
test_math_log10("1RTSLEF");
test_math_log10(-511);
test_math_log10("L0YFKBWY");
test_math_log10(3.6416781499308506e+307);
test_math_log10("L0IZP");
test_math_log10("0Q7PO");
test_math_log10("SAOIGI");
test_math_log10(2.549761167876142e+307);
test_math_log10(322);
test_math_log10(174);
test_math_log10("9XHF0Y2Q");
test_math_log10("8E3MVWCMGF");
test_math_log10(368);
test_math_log10(572);
test_math_log10(-617);
test_math_log10(192);
test_math_log10(1.0128652092635187e+308);
test_math_log10("0C3KXGPT5");
test_math_log10(7.430253453598896e+307);
test_math_log10(-863);
test_math_log10(1.7326598576762952e+308);
test_math_log10(294);
test_math_log10("FCLQDRC1Z");
test_math_log10("L4PLWOPTW3");
test_math_log10(6.181862622308067e+307);
test_math_log10(1.460243415007466e+308);
test_math_log10("URA");
test_math_log10("PYMFG6");
test_math_log10(104);
test_math_log10(1.5205922254663785e+308);
test_math_log10(52);
test_math_log10(-417);
test_math_log10("E0RS6GU078");
test_math_log10(1.3019299554298287e+308);
test_math_log10(9.788594794627787e+307);
test_math_log10("FZ0");
test_math_log10(1.0103153861443069e+308);
test_math_log10(158);
test_math_log10(1.307319657971075e+308);
test_math_log10("0RGV");
test_math_log10(244);
test_math_log10("MGZ23NQZEJ");
test_math_log10(-623);
test_math_log10("JT6ELEII");
test_math_log10(-501);
test_math_log10(584);
test_math_log10(3.9144599177476843e+307);
test_math_log10(1.5827791514817734e+308);
test_math_log10(-273);
test_math_log10(642);
test_math_log10(1.594610842437033e+308);
test_math_log10(1.2334481918820286e+308);
test_math_log10(7.93358356870223e+307);
test_math_log10(514);
test_math_log10("Q5VS7Z98K");
test_math_log10("LLMRJUG2");
test_math_log10(470);
test_math_log10("CH4N59");
test_math_log10(1.1697444798258055e+308);
test_math_log10(998);
test_math_log10(1.7069458510689016e+308);
test_math_log10("HMAI0");
test_math_log10(4.969510099597928e+307);
test_math_log10(-785);
test_math_log10("KP7AC139N");
test_math_log10(-529);
test_math_log10(-875);
test_math_log10("9E7CD");
test_math_log10(5.797366392437547e+307);
test_math_log10(-861);
test_math_log10(-427);
test_math_log10(-913);
test_math_log10(1.2025549206588777e+308);
test_math_log10(146);
test_math_log10("ZELFX43CLH");
test_math_log10(86);
test_math_log10("1ASG4MXN");
test_math_log10("1N05P57VET");
test_math_log10("YWE9S5VBW");
test_math_log10("OF4ZV8S");
test_math_log10(1.3957993323201888e+308);
test_math_log10("D7HRZQX");
test_math_log10("ODSX3O6");
test_math_log10(5.754592581459689e+307);
test_math_log10("N1DC68RW");
test_math_log10(-433);
test_math_log10(68);
test_math_log10(-97);
test_math_log10(1.2442579195268834e+308);
test_math_log10("XLIKQRJYA");
test_math_log10("36L73");
test_math_log10("OXSBTMR");
test_math_log10(1.0086848820831482e+308);
test_math_log10(-961);
test_math_log10("VHN1");
test_math_log10(640);
test_math_log10("6JW1WC");
test_math_log10("03GBKUFJM0");
test_math_log10(-641);
test_math_log10("Y2S91");
test_math_log10(2.0504454929920345e+307);
test_math_log10(7.212418828951004e+307);
test_math_log10("PH170M");
test_math_log10(662);
test_math_log10("DYTXYLSU68");
test_math_log10(626);
test_math_log10("CS79");
test_math_log10("NU8BWQB");
test_math_log10(1.5055273246112412e+308);
test_math_log10(5.031022960225126e+306);
test_math_log10(-153);
test_math_log10("OZ0JH");
test_math_log10(-323);
test_math_log10(-315);
test_math_log10(3.71560676808243e+307);
test_math_log10(-259);
test_math_log10(-173);
test_math_log10(-943);
test_math_log10(-347);
test_math_log10("7PG");
test_math_log10(382);
test_math_log10(4.663352055243145e+307);
test_math_log10(-821);
test_math_log10(-541);
test_math_log10("ZSCYP3YBM");
test_math_log10(486);
test_math_log10("Y67W6IR5");
test_math_log10("RSOKWGURNE");
test_math_log10(3.054902683459721e+307);
test_math_log10(1.5856653539024343e+308);
test_math_log10(1.7703497926572386e+308);
test_math_log10(-823);
test_math_log10("J1X");
test_math_log10(82);
test_math_log10(7.553348828936022e+307);
test_math_log10(578);
test_math_log10(9.57028965278582e+306);
test_math_log10(1.1762566236643275e+308);
test_math_log10(8.806730042702798e+307);
test_math_log10(874);
test_math_log10("CAAD");
test_math_log10("715XB96IC");
test_math_log10(7.464681552565553e+307);
test_math_log10(792);
test_math_log10(814);
test_math_log10("IQX3VVUL74");
test_math_log10(9.821908211062798e+307);
test_math_log10("NRXYU5");
test_math_log10(1.6272693110675273e+308);
test_math_log10(9.682113809591997e+307);
test_math_log10(1.689875128939091e+308);
test_math_log10(1.4910765709339525e+308);
test_math_log10(878);
test_math_log10(9.982448782323171e+306);
test_math_log10("OF6069J");
test_math_log10(1.684650186565383e+308);
test_math_log10(1.79595045017359e+308);
test_math_log10(7.421209302130139e+307);
test_math_log10(1.1107141221300028e+308);
test_math_log10(156);
test_math_log10("JBXJ80DX");
test_math_log10("73G30W2PSX");
test_math_log10(888);
test_math_log10("84YIUAXXU");
test_math_log10(152);
test_math_log10("BQFSD1");
test_math_log10(-383);
test_math_log10(7.56009997854867e+307);
test_math_log10(932);
test_math_log10(3.4097948884833686e+307);
test_math_log10(-879);
test_math_log10(3.578656012638659e+307);
test_math_log10("3YRJWN6HB");
test_math_log10(-759);
test_math_log10(704);
test_math_log10(1.5455964903868252e+307);
test_math_log10(9.20738186095027e+307);
test_math_log10("M9NKA1S19B");
test_math_log10(9.92428334169604e+307);
test_math_log10("3ZJDAZ8DSS");
test_math_log10(510);
test_math_log10("8ER");
test_math_log10(6.183211009991381e+307);
test_math_log10(3.87018099673281e+307);
test_math_log10("2XIFS93RR");
test_math_log10(1.0937604480932378e+308);
test_math_log10("91T438RUV");
test_math_log10("K56F");
test_math_log10(3.282394667841825e+307);
test_math_log10("J3A");
test_math_log10("AYLQX");
test_math_log10(1.3094924988901973e+308);
test_math_log10(0);
test_math_log10("MPCWXN");
test_math_log10("ETMCZDWZ");
test_math_log10("H94W0S");
test_math_log10("G0X38");
test_math_log10("8A6");
test_math_log10(1.1571378771054568e+308);
test_math_log10("1YF60JJ");
test_math_log10(34);
test_math_log10(8.301410043466324e+307);
test_math_log10(5.207245699454069e+307);
test_math_log10(3.1415926);
test_math_log10("MFV95K");
test_math_log10(-279);
test_math_log10(586);
test_math_log10(-389);
test_math_log10(1.019999159595146e+308);
test_math_log10(1.4088230612952895e+308);
test_math_log10("GCHLE07L");
test_math_log10(1.2615928569542385e+308);
test_math_log10(3.05001945324391e+307);
test_math_log10(2.1616130794583205e+307);
test_math_log10("28QZ272RV0");
test_math_log10(616);
test_math_log10(1.5191500181491534e+308);
test_math_log10(1.2637397771276662e+308);
test_math_log10(1.0918692141836262e+308);
test_math_log10(1);
test_math_log10(1.2883431153724884e+308);
test_math_log10(-453);
test_math_log10(1.401076075132031e+308);
test_math_log10(570);
