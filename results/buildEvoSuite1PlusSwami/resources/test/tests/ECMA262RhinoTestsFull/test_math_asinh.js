/*
* This file is automatically generated by GenTest
*
* 2018-08-06 15:08:53.417945
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
function test_math_asinh(x){
	if (Object.is( x,NaN)){
		var output = Math.asinh(x);
		new TestCase("math_asinh", "math_asinh", NaN, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x===0)){
		var output = Math.asinh(x);
		new TestCase("math_asinh", "math_asinh", 0, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x===-0)){
		var output = Math.asinh(x);
		new TestCase("math_asinh", "math_asinh", -0, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x===Infinity)){
		var output = Math.asinh(x);
		new TestCase("math_asinh", "math_asinh", Infinity, output);
		test();
		//console.log("Good Test")
		return
		}
	if (( x===-Infinity)){
		var output = Math.asinh(x);
		new TestCase("math_asinh", "math_asinh", -Infinity, output);
		test();
		//console.log("Good Test")
		return
		}
	//console.log("OK Test")
}

/*TESTS GENERATED AUTOMATICALLY*/
test_math_asinh(undefined);
test_math_asinh(490);
test_math_asinh(-197);
test_math_asinh(/[\u0400-\u04FF]+/g);
test_math_asinh(/ab+c/);
test_math_asinh(1.588485271840786e+308);
test_math_asinh(-439);
test_math_asinh(4.3133692709762647e+307);
test_math_asinh(4.788239787022299e+307);
test_math_asinh(-161);
test_math_asinh(6.29456926623094e+307);
test_math_asinh(NaN);
test_math_asinh(true);
test_math_asinh("Q6CT1QO");
test_math_asinh(9.210845025675227e+307);
test_math_asinh("E48X2SOB8A");
test_math_asinh(7.148681817739435e+307);
test_math_asinh("Y67W6IR5");
test_math_asinh(/[^.]+/);
test_math_asinh(/yes.*day/);
test_math_asinh(false);
test_math_asinh("DYJ");
test_math_asinh("EN95P");
test_math_asinh(Infinity);
test_math_asinh(-419);
test_math_asinh(/yes[^]*day/);
test_math_asinh("CVTTKT4X");
test_math_asinh(/foo/g);
test_math_asinh("42PK1NNV1Z");
test_math_asinh(-0);
test_math_asinh("RIKD");
test_math_asinh(504);
test_math_asinh(1.1270143148660944e+308);
test_math_asinh("HY0EG487N");
test_math_asinh(5.593850319635856e+307);
test_math_asinh(-551);
test_math_asinh(4.976568147584705e+307);
test_math_asinh(632);
test_math_asinh(+0);
test_math_asinh("QQ97C");
test_math_asinh(-599);
test_math_asinh(null);
test_math_asinh(-863);
test_math_asinh("KUKQ1E");
test_math_asinh(7.976115907024914e+307);
test_math_asinh(/\r\n|\r|\n/);
test_math_asinh("DE69YO5H");
test_math_asinh(1.3805652889486906e+308);
test_math_asinh("XUG");
test_math_asinh("HYI26B01");
test_math_asinh(6.772545408086938e+307);
test_math_asinh(-985);
test_math_asinh(-31);
test_math_asinh(762);
test_math_asinh(1.4409782903013368e+308);
test_math_asinh(/(\w+)\s(\w+)/);
test_math_asinh("P37X");
test_math_asinh(7.625183484858018e+307);
test_math_asinh("ZLFV26");
test_math_asinh(654);
test_math_asinh(4);
test_math_asinh(3.204357775163545e+307);
test_math_asinh(268);
test_math_asinh(1.0313835051268318e+308);
test_math_asinh("CE2TWNMS7");
test_math_asinh("8OLN8");
test_math_asinh(-921);
test_math_asinh(-21);
test_math_asinh(798);
test_math_asinh(640);
test_math_asinh("24ZD4OM");
test_math_asinh("7JLY");
test_math_asinh(-111);
test_math_asinh(-193);
test_math_asinh(50);
test_math_asinh("6J6J2G5P1M");
test_math_asinh("O2R1ASTK");
test_math_asinh(630);
test_math_asinh(1.5666347049725835e+308);
test_math_asinh(1.4072499073689094e+308);
test_math_asinh(188);
test_math_asinh(6.181862622308067e+307);
test_math_asinh(622);
test_math_asinh("AMFCSMBCV");
test_math_asinh(9.682113809591997e+307);
test_math_asinh(1);
test_math_asinh("RSOKWGURNE");
test_math_asinh(-537);
test_math_asinh(1.0620494952027833e+308);
test_math_asinh(1.1449259678654194e+307);
test_math_asinh(8.860263817640932e+307);
test_math_asinh(1.10109904386649e+308);
test_math_asinh(736);
test_math_asinh(-173);
test_math_asinh(-713);
test_math_asinh(770);
test_math_asinh(1.6858686880818738e+307);
test_math_asinh(52);
test_math_asinh("7CNU7KSQRG");
test_math_asinh(-897);
test_math_asinh(1.4910765709339525e+308);
test_math_asinh(2.080555746702048e+307);
test_math_asinh(-75);
test_math_asinh(-183);
test_math_asinh("U516");
test_math_asinh(1.684650186565383e+308);
test_math_asinh("0PD");
test_math_asinh(9.55572711835882e+307);
test_math_asinh(6.974103930409919e+307);
test_math_asinh(930);
test_math_asinh("2WF21X44L");
test_math_asinh("NRXYU5");
test_math_asinh("60PS");
test_math_asinh(3.573775609150457e+307);
test_math_asinh(-323);
test_math_asinh(1.117355463090248e+308);
test_math_asinh("XKDF5MQ6");
test_math_asinh(962);
test_math_asinh("8797O9");
test_math_asinh("A9VG6");
test_math_asinh("3MGHG");
test_math_asinh("TM507K");
test_math_asinh(15);
test_math_asinh(1.4613504378524876e+308);
test_math_asinh("I0EOX79VE8");
test_math_asinh("QUZP");
test_math_asinh("29OEA");
test_math_asinh(-977);
test_math_asinh(454);
test_math_asinh("9USSFX6VRX");
test_math_asinh(-869);
test_math_asinh("NU8BWQB");
test_math_asinh(-515);
test_math_asinh("XOMOHHG7C");
test_math_asinh(1.3350430881007546e+308);
test_math_asinh(1.5625299069426202e+308);
test_math_asinh("QKL");
test_math_asinh("7UPZ1");
test_math_asinh(1.5484151293707044e+308);
test_math_asinh(802);
test_math_asinh(68);
test_math_asinh(-783);
test_math_asinh(-629);
test_math_asinh("5DXZNG8");
test_math_asinh(8.972856733100049e+307);
test_math_asinh(-795);
test_math_asinh(1.4977590168723283e+308);
test_math_asinh(-845);
test_math_asinh(-213);
test_math_asinh("CPLB309OY");
test_math_asinh("3NMUTDF");
test_math_asinh(-701);
test_math_asinh(524);
test_math_asinh(390);
test_math_asinh(2.984392555334172e+307);
test_math_asinh(7.431595978985482e+307);
test_math_asinh(7.482196043370106e+307);
test_math_asinh(8.717534338315379e+307);
test_math_asinh(-227);
test_math_asinh(5.463593773685196e+307);
test_math_asinh("CIG0LJ5");
test_math_asinh(9.92428334169604e+307);
test_math_asinh(934);
test_math_asinh(-709);
test_math_asinh(412);
test_math_asinh("CKNGLI");
test_math_asinh(8.617072532202659e+307);
test_math_asinh("GBE8L9LR9V");
test_math_asinh(5.253799370920178e+307);
test_math_asinh("3JZQ6GS");
test_math_asinh(2.1616130794583205e+307);
test_math_asinh(-577);
test_math_asinh("KIDMC");
test_math_asinh("3PV");
test_math_asinh("DUE95XN");
test_math_asinh(5.492698658602177e+307);
test_math_asinh(9.641636894364623e+307);
test_math_asinh(-733);
test_math_asinh("FZ0");
test_math_asinh(1.2268467262050137e+308);
test_math_asinh(1.3651557769261658e+308);
test_math_asinh(-129);
test_math_asinh(-815);
test_math_asinh("7RJ");
test_math_asinh(146);
test_math_asinh(1.2478449447960055e+308);
test_math_asinh("CS79");
test_math_asinh(-427);
test_math_asinh("ZAHKO7O");
test_math_asinh("M3JJUS53");
test_math_asinh(1.163930269274203e+308);
test_math_asinh(1.2615928569542385e+308);
test_math_asinh("Y3393Q6PUP");
test_math_asinh(-801);
test_math_asinh("8SQSHAJ2PL");
test_math_asinh("1EDOTMO107");
test_math_asinh(1.0086848820831482e+308);
test_math_asinh("A7X6O");
test_math_asinh("9K34S23");
test_math_asinh(1.0597228843936999e+307);
test_math_asinh("CP4QZR8I");
test_math_asinh(-605);
test_math_asinh(5.64388182629727e+307);
test_math_asinh("EEZVH2");
test_math_asinh("N9MVOCAL4W");
test_math_asinh(-179);
test_math_asinh(-945);
test_math_asinh("67LJA652X");
test_math_asinh("686K0R");
test_math_asinh(1.0805815803978858e+308);
test_math_asinh(9.08286259831794e+307);
test_math_asinh("UJGPMF");
test_math_asinh("H5CZ4W2V3");
test_math_asinh(-933);
test_math_asinh(818);
test_math_asinh("YIJ4Q");
test_math_asinh("WWNBXI457C");
test_math_asinh(9.700444460275507e+307);
test_math_asinh(-353);
test_math_asinh(-361);
test_math_asinh("1Y66SC");
test_math_asinh(1.2998076827237681e+308);
test_math_asinh("RNO6KKZR");
test_math_asinh(1.2025549206588777e+308);
test_math_asinh(-641);
test_math_asinh(-611);
test_math_asinh(-859);
test_math_asinh(1.401076075132031e+308);
test_math_asinh("XA4CL7DOH0");
test_math_asinh(1.434358612207422e+308);
test_math_asinh("RMYF");
test_math_asinh(-557);
test_math_asinh(1.4928190836134416e+308);
test_math_asinh(6.574681350883269e+307);
test_math_asinh(.1e-23);
test_math_asinh(38);
test_math_asinh("TXR");
test_math_asinh(1.307319657971075e+308);
test_math_asinh(1.019999159595146e+308);
test_math_asinh(-657);
test_math_asinh("8E3MVWCMGF");
test_math_asinh("UT2V04");
test_math_asinh(2.4838787794692676e+307);
test_math_asinh(-147);
test_math_asinh(-887);
test_math_asinh(344);
test_math_asinh("SGWBX6JUN");
test_math_asinh(1.2345934083481136e+308);
test_math_asinh("GDJ");
test_math_asinh("94I6TK4");
test_math_asinh("6WHRI86P");
test_math_asinh(2.769005067589091e+307);
test_math_asinh(2.7154628899834713e+306);
test_math_asinh("4QHYGSVILX");
test_math_asinh(7.046806119928516e+307);
test_math_asinh("7B5");
test_math_asinh(-993);
test_math_asinh(-315);
test_math_asinh(-625);
test_math_asinh(3.9144599177476843e+307);
test_math_asinh("1NB41RF");
test_math_asinh(-505);
test_math_asinh("JEEF");
test_math_asinh(6.512732414764592e+307);
test_math_asinh("BZ1");
test_math_asinh(4.632870863160796e+307);
test_math_asinh(6.569099649117372e+307);
test_math_asinh("XRGMY2XM");
test_math_asinh(1.1653952750206967e+308);
test_math_asinh(8.610301444547736e+307);
test_math_asinh(838);
test_math_asinh(1.815183913775643e+305);
test_math_asinh(5.451402660164151e+307);
test_math_asinh("PHW9Y8X");
test_math_asinh(-667);
test_math_asinh(810);
test_math_asinh(2.945350002375746e+307);
test_math_asinh(-349);
test_math_asinh(-333);
test_math_asinh(7.479379083188314e+307);
test_math_asinh("BDX4H");
test_math_asinh(-41);
test_math_asinh("9P97Y9CG");
test_math_asinh(2.39391803428365e+307);
test_math_asinh("8OU3NSUP0G");
test_math_asinh("JTJ5AVUHRA");
test_math_asinh(560);
test_math_asinh(2.5104351256025985e+306);
test_math_asinh(1.6146916141304213e+308);
test_math_asinh(5.3828775263422776e+306);
test_math_asinh(370);
test_math_asinh(-19);
test_math_asinh(1.1190660175382677e+308);
test_math_asinh(1.541543474806182e+308);
test_math_asinh(5.031022960225126e+306);
test_math_asinh("YUDPRF");
test_math_asinh(4.381721377041094e+307);
test_math_asinh(12);
test_math_asinh("MGOZ");
test_math_asinh(1.292039397627496e+308);
test_math_asinh("TTUAR9IQAZ");
test_math_asinh(9.648684163964489e+307);
test_math_asinh("2IEW");
test_math_asinh(850);
test_math_asinh(1.6887517625386999e+308);
test_math_asinh(5.628593193930836e+307);
test_math_asinh("ENKLT");
test_math_asinh("ZFNLXZYG");
test_math_asinh(-967);
test_math_asinh(1.6901919271524998e+308);
test_math_asinh(3.05001945324391e+307);
test_math_asinh(1.500581419649575e+308);
test_math_asinh("J7F31A");
test_math_asinh("DFXYTUTR80");
test_math_asinh(4.9362433062206545e+306);
test_math_asinh("55T");
test_math_asinh(7.053925760514036e+307);
test_math_asinh(1.152842255517459e+308);
test_math_asinh("L8VR1URO5B");
test_math_asinh(1.4255331305017212e+308);
test_math_asinh(1.3066625639687815e+308);
test_math_asinh("WE7O4HYQ");
test_math_asinh(-255);
test_math_asinh(-669);
test_math_asinh(-59);
test_math_asinh(898);
test_math_asinh(190);
test_math_asinh(-785);
test_math_asinh(-683);
test_math_asinh(1.4515936383372153e+308);
test_math_asinh("1JV2");
test_math_asinh("9XYBCVQ8");
test_math_asinh(158);
test_math_asinh("PW3CD2E6");
test_math_asinh("7JP8");
test_math_asinh(642);
test_math_asinh("FYWA");
test_math_asinh(-865);
test_math_asinh(1.3216654325289898e+308);
test_math_asinh("E6VA9T6A4");
test_math_asinh("NXE9A");
test_math_asinh("LYNZRSRC7Q");
test_math_asinh("BPWSDS");
test_math_asinh("6NRKZ");
test_math_asinh("BP53412WX");
test_math_asinh(-723);
test_math_asinh(8.836601575350207e+307);
test_math_asinh(9.593657052835947e+307);
test_math_asinh(-205);
test_math_asinh(4.61356797086095e+307);
test_math_asinh(7.004238136846173e+307);
test_math_asinh(634);
test_math_asinh("99C77B");
test_math_asinh(-835);
test_math_asinh(1.617567295907548e+308);
test_math_asinh("ECVEIK0L");
test_math_asinh("Y85ME69G2");
test_math_asinh(1.7643361314775676e+308);
test_math_asinh("MINXE");
test_math_asinh("X5M");
test_math_asinh(-591);
test_math_asinh("97IGPDMB");
test_math_asinh("VNPYID7BO");
test_math_asinh(4.073304286634555e+307);
test_math_asinh("NCXEKHGC6Z");
test_math_asinh(8.622731626003035e+307);
test_math_asinh("W5E74X0R");
test_math_asinh(6.437050272500683e+307);
test_math_asinh(2.916904879326748e+307);
test_math_asinh(-281);
test_math_asinh(232);
test_math_asinh(-965);
test_math_asinh("9EM");
test_math_asinh(284);
test_math_asinh("JBOKOSLRSD");
test_math_asinh("MYFGTN3BP");
test_math_asinh(4.137704963444624e+307);
test_math_asinh("GJAMZ");
test_math_asinh(4.808434055806739e+307);
test_math_asinh("36ZG");
test_math_asinh(616);
test_math_asinh("3FT8RN8");
test_math_asinh(8.081728925371161e+306);
test_math_asinh("NN8ZPX");
test_math_asinh("PSQ4IK46H");
test_math_asinh(-123);
test_math_asinh("B5HARNB");
test_math_asinh("VPZH11J");
test_math_asinh("VUW5YWAABY");
test_math_asinh(608);
test_math_asinh(3.645547607089099e+307);
test_math_asinh(1.162246688829049e+308);
test_math_asinh(8.216818510163123e+306);
test_math_asinh(-719);
test_math_asinh(1.753194160466046e+307);
test_math_asinh("7VOSMH7Q");
test_math_asinh(7.840752785443556e+306);
test_math_asinh(1.678232162585585e+307);
test_math_asinh(3.298002988992441e+307);
test_math_asinh(1.4974223207687564e+308);
test_math_asinh(3.054902683459721e+307);
test_math_asinh(-339);
test_math_asinh(9.68599240458938e+307);
test_math_asinh("BQFSD1");
test_math_asinh(1.4230927515791057e+308);
test_math_asinh(1.7277865700451757e+308);
test_math_asinh(530);
test_math_asinh(-595);
test_math_asinh(34);
test_math_asinh(5.875101664584467e+307);
test_math_asinh(3.3079400248669755e+307);
test_math_asinh("4TIN2Z");
test_math_asinh(1.3748215514335227e+308);
test_math_asinh(772);
test_math_asinh(1.629276023012905e+308);
test_math_asinh("ACYIES");
test_math_asinh(3.4142836436575315e+307);
test_math_asinh(142);
test_math_asinh("Y00PR02SS");
test_math_asinh(-697);
test_math_asinh(5.338730995069495e+307);
test_math_asinh(1.3411511489440784e+308);
test_math_asinh("6JW1WC");
test_math_asinh(2.9160610564147923e+307);
test_math_asinh(3.981593525220612e+307);
test_math_asinh(8.160531417198545e+307);
test_math_asinh("P4D6U0RSD3");
test_math_asinh(-639);
test_math_asinh("JNCA1MFPZJ");
test_math_asinh("H2125ZFHS");
test_math_asinh("F37OX");
test_math_asinh(-501);
test_math_asinh(-441);
test_math_asinh(8.588021583161297e+307);
test_math_asinh(6.448010257430954e+307);
test_math_asinh("E72H");
test_math_asinh("76UZLQ6");
test_math_asinh(-389);
test_math_asinh(1.6243571439329942e+308);
test_math_asinh(8.143761126883002e+307);
test_math_asinh("34PC2X");
test_math_asinh(4.604608136599228e+307);
test_math_asinh(6.281426703016667e+307);
test_math_asinh("CKPGIY");
test_math_asinh(1.6045018096980277e+308);
test_math_asinh("C19U");
test_math_asinh(-347);
test_math_asinh(1.3900593622248962e+308);
test_math_asinh("W6F36");
test_math_asinh(1.3431625045448083e+308);
test_math_asinh(1.0661616970259494e+308);
test_math_asinh("8BHFX");
test_math_asinh("EGCVVSIYU7");
test_math_asinh(1.374088297647724e+308);
test_math_asinh("0P4M");
test_math_asinh("BV223Y2SMR");
test_math_asinh(5.523719990337418e+307);
test_math_asinh("8ZS6849RAY");
test_math_asinh("WWAC3ZF");
test_math_asinh(-311);
test_math_asinh(-823);
test_math_asinh("XC4OT");
test_math_asinh(0);
test_math_asinh(1.44078427990042e+308);
test_math_asinh(1.2541626337538227e+308);
test_math_asinh("I66ZXZ");
test_math_asinh("V7KO08H");
test_math_asinh(1.6275275491462221e+308);
test_math_asinh("0TJKH");
test_math_asinh(-843);
test_math_asinh(816);
test_math_asinh(-65);
test_math_asinh("QHB");
test_math_asinh(-279);
test_math_asinh("A1TK3KH1");
test_math_asinh(-233);
test_math_asinh("6TU9");
test_math_asinh(3.9696951464961176e+307);
test_math_asinh(1.7880039786650698e+308);
test_math_asinh("8A6");
test_math_asinh(1.6207815558471343e+308);
test_math_asinh("1Y98Q1H");
test_math_asinh(5.988653419978617e+307);
test_math_asinh(62);
test_math_asinh("N0P4W1N");
test_math_asinh("B5M6G84C53");
test_math_asinh("DOR3IJIP0");
test_math_asinh("1PG7B");
test_math_asinh(-335);
test_math_asinh(7.229915712670086e+307);
test_math_asinh("CRMBRX0");
test_math_asinh("Y44KKT");
test_math_asinh("YURCUA03N7");
test_math_asinh("UM7Y");
test_math_asinh(3.064509177540692e+307);
test_math_asinh(-653);
test_math_asinh(546);
test_math_asinh(1.0715259613098066e+308);
test_math_asinh("ZS812NC");
test_math_asinh("O68KT4O65R");
test_math_asinh("00FEJXP");
test_math_asinh(8.177816022714717e+307);
test_math_asinh(6.783521941647744e+307);
test_math_asinh("IOJ3TR7");
test_math_asinh(904);
test_math_asinh("XCGP");
test_math_asinh(-957);
test_math_asinh(360);
test_math_asinh("9JY3JRNKF");
test_math_asinh("279");
test_math_asinh(166);
test_math_asinh(-351);
test_math_asinh(4.69933251635389e+307);
test_math_asinh("9RRMO2");
test_math_asinh(1.2109717602702095e+308);
test_math_asinh(1.480275459668217e+308);
test_math_asinh(-491);
test_math_asinh(-61);
test_math_asinh(526);
test_math_asinh(-547);
test_math_asinh("1KZC");
test_math_asinh("3Q0GR71U");
test_math_asinh("9IPVNM");
test_math_asinh("LXT3I");
test_math_asinh("9OK85PWL");
test_math_asinh(3.9478308505697376e+307);
test_math_asinh(1.6272693110675273e+308);
test_math_asinh(8.806730042702798e+307);
test_math_asinh(1.1145832765631384e+308);
test_math_asinh(892);
test_math_asinh(4.909767337036234e+307);
test_math_asinh(2);
test_math_asinh(1.2632209673275755e+308);
test_math_asinh("UYBVDVZ");
test_math_asinh(1.2570082812315526e+308);
test_math_asinh(1.6086497775623906e+308);
test_math_asinh(9.788594794627787e+307);
test_math_asinh("TQSCU57I");
test_math_asinh(1.609463173930912e+308);
test_math_asinh(1.3109158923779175e+308);
test_math_asinh("N39C8");
test_math_asinh(-367);
test_math_asinh(7.294747092293342e+307);
test_math_asinh(1.458414067729962e+308);
test_math_asinh(-747);
test_math_asinh("YG6FE998ZN");
test_math_asinh(682);
test_math_asinh("SG4VJB");
test_math_asinh(1.5988416718570098e+308);
test_math_asinh(-47);
test_math_asinh(-77);
test_math_asinh("R3ROB1GZ3");
test_math_asinh(6.183211009991381e+307);
test_math_asinh("36Y3");
test_math_asinh(-359);
test_math_asinh(3.802876522784741e+306);
test_math_asinh(936);
test_math_asinh(2.2050538445290984e+307);
test_math_asinh(-919);
test_math_asinh(-855);
test_math_asinh(-139);
test_math_asinh(-955);
test_math_asinh(404);
test_math_asinh(-459);
test_math_asinh(4.617401143789919e+307);
test_math_asinh(2.3654337468656967e+307);
test_math_asinh(138);
test_math_asinh(964);
test_math_asinh("Y63Y");
test_math_asinh(676);
test_math_asinh(724);
test_math_asinh(776);
test_math_asinh("MPCWXN");
test_math_asinh(1.102761712951147e+308);
test_math_asinh(7.212418828951004e+307);
test_math_asinh(4.576991085408823e+307);
test_math_asinh("X8DK4");
test_math_asinh(1.0197618069821016e+308);
test_math_asinh(1.4788899907608977e+308);
test_math_asinh("SAX8Q8");
test_math_asinh("UA4QM");
test_math_asinh(-861);
test_math_asinh(-217);
test_math_asinh(6.40753425080583e+307);
test_math_asinh(766);
test_math_asinh("TKVM");
test_math_asinh(3.6836222598422533e+307);
test_math_asinh("5OIU84O");
test_math_asinh(1.173081418347693e+307);
test_math_asinh(8.658017118952238e+306);
test_math_asinh("HRXIRAVSV");
test_math_asinh("DMDQO45");
test_math_asinh("WSO");
test_math_asinh(1.253609569176689e+305);
test_math_asinh(8.628959427913569e+307);
test_math_asinh("B2DGHUBRP");
test_math_asinh("G6IEIRC");
test_math_asinh("84YIUAXXU");
test_math_asinh(8.715124328990999e+307);
test_math_asinh("25M");
test_math_asinh("F4NZOA");
test_math_asinh(9.658289936823003e+307);
test_math_asinh(1.3594451216946437e+308);
test_math_asinh("Y2S91");
test_math_asinh("8SOI588");
test_math_asinh(6.19520587643039e+307);
test_math_asinh("DQ8NRGVP");
test_math_asinh(118);
test_math_asinh(-477);
test_math_asinh(3.558066399018151e+307);
test_math_asinh(502);
test_math_asinh("CM3B43");
test_math_asinh(3.223083269826313e+307);
test_math_asinh(122);
test_math_asinh(0x1123);
test_math_asinh(-169);
test_math_asinh("EJD9N9D");
test_math_asinh("2RZMJPUDL");
test_math_asinh(780);
test_math_asinh(-237);
test_math_asinh(-963);
test_math_asinh(1.358123445653156e+308);
test_math_asinh(958);
test_math_asinh(2.5352520835685794e+307);
test_math_asinh(-587);
test_math_asinh(-877);
test_math_asinh("44UDL");
test_math_asinh("OJSJVWS7X");
test_math_asinh("1OH7J2MHM");
test_math_asinh("4JCT");
test_math_asinh(8.434225899257914e+307);
test_math_asinh(9.682376775540096e+307);
test_math_asinh("ZQG256PIS");
test_math_asinh(3.628779852986422e+307);
test_math_asinh(6.274005475432309e+307);
test_math_asinh("9AWQEVE084");
test_math_asinh("T8JGKOL14");
test_math_asinh(7.989909957888121e+305);
test_math_asinh("Z66U3");
test_math_asinh(1.0379930409956463e+308);
test_math_asinh("FMAAQIF7Z7");
test_math_asinh("B2HN");
test_math_asinh(570);
test_math_asinh(3.422473438449246e+307);
test_math_asinh(5.1521157999631977e+306);
test_math_asinh("OH70R6I");
test_math_asinh(1.2216099307652191e+308);
test_math_asinh(3.266436929925874e+307);
test_math_asinh(886);
test_math_asinh(-17);
test_math_asinh(842);
test_math_asinh("CZOY");
test_math_asinh(792);
test_math_asinh(14);
test_math_asinh("7SEO6FK");
test_math_asinh(6.812761270505109e+307);
test_math_asinh("5DKKN5D4");
test_math_asinh(6.297423483983797e+307);
test_math_asinh("5IRW2I6EH");
test_math_asinh("VV0BN3LWCP");
test_math_asinh(4.274545971830702e+307);
test_math_asinh(-685);
test_math_asinh(6.411690194461884e+307);
test_math_asinh(7.421209302130139e+307);
test_math_asinh("UHVQNK");
test_math_asinh(604);
test_math_asinh(-761);
test_math_asinh(1.352202017893669e+308);
test_math_asinh(7.728789470542793e+307);
test_math_asinh("4DOFU");
test_math_asinh(120);
test_math_asinh(1.7376718119019819e+308);
test_math_asinh("IDIXZCB");
test_math_asinh("5MDPNR");
test_math_asinh(-189);
test_math_asinh(-839);
test_math_asinh(1.23897258915658e+308);
test_math_asinh(-283);
test_math_asinh(3.747991154002268e+307);
test_math_asinh("CYSU2");
test_math_asinh("Q8DAO4RML");
test_math_asinh("I710M0TAP5");
test_math_asinh("QKK86CDVGT");
test_math_asinh(-447);
test_math_asinh("91T438RUV");
test_math_asinh(742);
test_math_asinh("3F5ZEJI");
test_math_asinh(1.7178202652999188e+308);
test_math_asinh(4.969510099597928e+307);
test_math_asinh(216);
test_math_asinh(308);
test_math_asinh("8QLQJ4AG");
test_math_asinh("35CK");
test_math_asinh("2ZMOJH3G");
test_math_asinh("OS6");
test_math_asinh("6MP0T49J");
test_math_asinh("II2VV");
test_math_asinh(5.604369883396726e+307);
test_math_asinh("5JYB");
test_math_asinh("7PG");
test_math_asinh(5.978651424590022e+307);
test_math_asinh("PM51QKY4");
test_math_asinh("4M0BSSP");
test_math_asinh("2XIFS93RR");
test_math_asinh("J6DN8DP");
test_math_asinh("IXC6");
test_math_asinh(1.4936383747944427e+308);
test_math_asinh(-507);
test_math_asinh("Y6XFA64T");
test_math_asinh(2.549761167876142e+307);
test_math_asinh(1.2652571677383962e+308);
test_math_asinh("JR43I");
test_math_asinh(614);
test_math_asinh("PYMFG6");
test_math_asinh(1.3859437836464115e+308);
test_math_asinh(30);
test_math_asinh("1NZYATWUGK");
test_math_asinh("2MD0CB5O");
test_math_asinh(950);
test_math_asinh("L89SAQ");
test_math_asinh(-511);
test_math_asinh("RN1VLBI");
test_math_asinh("MFV95K");
test_math_asinh(1.495523205715622e+308);
test_math_asinh(1.5791156589654846e+308);
test_math_asinh("2LNGG");
test_math_asinh(472);
test_math_asinh("URA");
test_math_asinh(4.4296763657772206e+306);
test_math_asinh("VML1J7A1AP");
test_math_asinh(-707);
test_math_asinh(-987);
test_math_asinh(1.0612212302149166e+308);
test_math_asinh("YQ0U");
test_math_asinh(8.507071854829311e+307);
test_math_asinh(896);
test_math_asinh("KAJDSAT");
test_math_asinh(6.103679491243833e+307);
test_math_asinh(-241);
test_math_asinh("J3A");
test_math_asinh(-615);
test_math_asinh(-535);
test_math_asinh(1.460243415007466e+308);
test_math_asinh(8.549723632002878e+307);
test_math_asinh(1.04085211477353e+308);
test_math_asinh(1.4289736605400244e+308);
test_math_asinh(1.0069735074376533e+308);
test_math_asinh("GLGKIL");
test_math_asinh(-113);
test_math_asinh(1.2691012355584719e+308);
test_math_asinh("GQQU");
test_math_asinh("3SWX");
test_math_asinh("05X6O7QD");
test_math_asinh(1.1211534009318745e+308);
test_math_asinh(272);
test_math_asinh(8.874301128277901e+307);
test_math_asinh("6JZGH7");
test_math_asinh("89ZMLRBBNG");
test_math_asinh("1HRN32R");
test_math_asinh(-661);
test_math_asinh(296);
test_math_asinh(7.055293042878639e+305);
test_math_asinh(1.6210757521253885e+308);
test_math_asinh(254);
test_math_asinh(-905);
test_math_asinh(1.7636667044233798e+308);
test_math_asinh(4.731226348279288e+307);
test_math_asinh(1.640361785278994e+308);
test_math_asinh("9JWI");
test_math_asinh(288);
test_math_asinh(740);
test_math_asinh(9.216886855687165e+307);
test_math_asinh(5.73265385019515e+307);
test_math_asinh(596);
test_math_asinh(7.73718251955268e+307);
test_math_asinh(298);
test_math_asinh("LX67BW");
test_math_asinh("B45IA");
test_math_asinh(1.237069238800062e+308);
test_math_asinh("8KYCFA");
test_math_asinh("M28");
test_math_asinh(650);
test_math_asinh("bar");
test_math_asinh("SRGQA3QM");
test_math_asinh(324);
test_math_asinh("CXTT3GGDP");
test_math_asinh("313NRT0");
test_math_asinh("EF3CWS");
test_math_asinh(394);
test_math_asinh("68545BAG5");
test_math_asinh(1.4530627984862936e+307);
test_math_asinh(7.250109850006442e+307);
test_math_asinh("I2IWWPQH");
test_math_asinh(804);
test_math_asinh(3.2620380254202084e+307);
test_math_asinh("TAG0P");
test_math_asinh(1.7909642832011443e+308);
test_math_asinh("ZPN9XV");
test_math_asinh(4.2644240161454774e+306);
test_math_asinh(1.72570345481561e+308);
test_math_asinh(-63);
test_math_asinh(1.5078379106870986e+308);
test_math_asinh("9TX");
test_math_asinh("BUV0B6MM");
test_math_asinh(-739);
test_math_asinh("L89C");
test_math_asinh(-959);
test_math_asinh(7.732690699990623e+307);
test_math_asinh(4.323716489303984e+306);
test_math_asinh(1.1314252353313515e+308);
test_math_asinh("HJY");
test_math_asinh(1.076858165336984e+308);
test_math_asinh(224);
test_math_asinh(-663);
test_math_asinh(1.3464403542569639e+308);
test_math_asinh(1.011801823600992e+308);
test_math_asinh(26);
test_math_asinh(1.5246224662809338e+308);
test_math_asinh(-825);
test_math_asinh("Z3YXXIJ9");
test_math_asinh(1.0439193706817403e+308);
test_math_asinh(-925);
test_math_asinh(1.8902489479636146e+307);
test_math_asinh(-729);
test_math_asinh("OABSZEON");
test_math_asinh(4.427614974603111e+307);
test_math_asinh("XVFYHO");
test_math_asinh("92S4YCQO");
test_math_asinh(-229);
test_math_asinh(7.50495530903712e+307);
test_math_asinh(1.0756029129554799e+308);
test_math_asinh(-797);
test_math_asinh("VHN1");
test_math_asinh("QX58");
test_math_asinh("XNKRMG0RRB");
test_math_asinh(-545);
test_math_asinh("WFBBDO1G6A");
test_math_asinh(1.7857750184800563e+307);
test_math_asinh("BFZNABOVT");
test_math_asinh("X3Y");
test_math_asinh(5.866807038928971e+307);
test_math_asinh("WLZ2");
test_math_asinh(134);
test_math_asinh(5.314212248818946e+307);
test_math_asinh(1.7146249673034532e+308);
test_math_asinh("WFPE");
test_math_asinh(6.183367346266746e+307);
test_math_asinh(3.221837981909409e+307);
test_math_asinh(1.185111085490427e+308);
test_math_asinh("RIA");
test_math_asinh("4R7W26");
test_math_asinh("5L0");
test_math_asinh(4.320380429192173e+307);
test_math_asinh(-363);
test_math_asinh(234);
test_math_asinh(1.0995324632968213e+308);
test_math_asinh(7.528315403482931e+307);
test_math_asinh("C92");
test_math_asinh(1.731404266819098e+308);
test_math_asinh(3.357202488072319e+307);
test_math_asinh(1.1471972898656594e+308);
test_math_asinh(462);
test_math_asinh("MGJXZ3TV");
test_math_asinh(376);
test_math_asinh(-497);
test_math_asinh(1.2191832305032185e+308);
test_math_asinh(9.10723668423676e+307);
test_math_asinh(128);
test_math_asinh(6.095748506635635e+307);
test_math_asinh(8.523432229045376e+307);
test_math_asinh(458);
test_math_asinh("X71SV");
test_math_asinh(1.7101027701863552e+308);
test_math_asinh(848);
test_math_asinh("42P2IF");
test_math_asinh(-917);
test_math_asinh(130);
test_math_asinh(5.602941947361849e+307);
test_math_asinh(-159);
test_math_asinh(106);
test_math_asinh(1.1649489485011365e+308);
test_math_asinh(3.87018099673281e+307);
test_math_asinh(1.7565392640101456e+308);
test_math_asinh("E5S1RUP");
test_math_asinh("UR86");
test_math_asinh(9.497571069141539e+307);
test_math_asinh(-821);
test_math_asinh(6.36503744647058e+307);
test_math_asinh(1.1321842482903422e+308);
test_math_asinh("58GW");
test_math_asinh(3.8649595603710317e+307);
test_math_asinh(-935);
test_math_asinh(1.2288228601120012e+308);
test_math_asinh(702);
test_math_asinh("3YRJWN6HB");
test_math_asinh("6EH1");
test_math_asinh(7.281269942609319e+307);
test_math_asinh("JT6ELEII");
test_math_asinh(5.929554652580214e+307);
test_math_asinh(2.9187479852418116e+307);
test_math_asinh(1.1782297930409767e+308);
test_math_asinh("R6P69");
test_math_asinh("XLIKQRJYA");
test_math_asinh("EKG");
test_math_asinh("C03R3A1");
test_math_asinh(424);
test_math_asinh("92USWLEOGI");
test_math_asinh(1.6656797180409002e+308);
test_math_asinh("HU1");
test_math_asinh("SQKZG2");
test_math_asinh(124);
test_math_asinh("OF4ZV8S");
test_math_asinh("L0YFKBWY");
test_math_asinh(2.5084314346290984e+307);
test_math_asinh(1.0053265477492645e+308);
test_math_asinh(8.087276721461177e+307);
test_math_asinh(1.3223153731569433e+308);
test_math_asinh(22);
test_math_asinh("3CFXLW");
test_math_asinh("HFU9YMH9");
test_math_asinh(-321);
test_math_asinh(1.796194669108272e+308);
test_math_asinh("7BAV");
test_math_asinh(836);
test_math_asinh("HHC");
test_math_asinh(2.254551561477714e+307);
test_math_asinh(4.92780960276812e+307);
test_math_asinh(1.3386510204587258e+308);
test_math_asinh("53IOXLG8");
test_math_asinh("RC23B9");
test_math_asinh(868);
test_math_asinh(1.6069912361981196e+308);
test_math_asinh(532);
test_math_asinh("NPO3PVPU5");
test_math_asinh(9.716339925466073e+307);
test_math_asinh(1.610119303006191e+308);
test_math_asinh(-329);
test_math_asinh(1.7825815608493742e+308);
test_math_asinh("N5KWPI");
test_math_asinh(2.83139522981917e+307);
test_math_asinh(928);
test_math_asinh("NTJJRUL");
test_math_asinh(-649);
test_math_asinh(-457);
test_math_asinh("BP9Q");
test_math_asinh("1DN0MFRWOO");
test_math_asinh(1.6389932582748384e+308);
test_math_asinh(-571);
test_math_asinh("6RD");
test_math_asinh("72N7D01F2");
test_math_asinh("48P1U");
test_math_asinh(1.1823531679616582e+308);
test_math_asinh(-461);
test_math_asinh("3GE0");
test_math_asinh(1.5856653539024343e+308);
test_math_asinh("1GNGG00SBM");
test_math_asinh("KIZ");
test_math_asinh(-647);
test_math_asinh("0IL4YEU6AK");
test_math_asinh(3.473802515858417e+307);
test_math_asinh("1KP");
test_math_asinh(140);
test_math_asinh(-43);
test_math_asinh(3.209116444623339e+307);
test_math_asinh("G1T06YUI6");
test_math_asinh("one line \n another line");
test_math_asinh(5.585917705678821e+307);
test_math_asinh("AP6");
test_math_asinh(4.820870362161341e+307);
test_math_asinh("KZLM9U");
test_math_asinh("MAMALOL0R");
test_math_asinh(7.744784372479752e+307);
test_math_asinh("X0S");
test_math_asinh("BQAZU12PXH");
test_math_asinh(6.196768867355343e+307);
test_math_asinh(888);
test_math_asinh(5.470282460930649e+307);
test_math_asinh("N1DC68RW");
test_math_asinh(874);
test_math_asinh(1.5926554301166708e+308);
test_math_asinh(384);
test_math_asinh(-891);
test_math_asinh(1.7871335380608528e+308);
test_math_asinh("9X6TC");
test_math_asinh(1.653148694564352e+307);
test_math_asinh(5.789723783258712e+307);
test_math_asinh(1.1596905637674352e+308);
test_math_asinh(-53);
test_math_asinh("SKO4T3UH");
test_math_asinh("7BPGIS");
test_math_asinh(1.1342452611286464e+308);
test_math_asinh(554);
test_math_asinh(1.761599745807455e+308);
test_math_asinh(-519);
test_math_asinh(486);
test_math_asinh(1.2395675604165778e+308);
test_math_asinh("PEGE9FCXG1");
test_math_asinh(-883);
test_math_asinh(4.958796446173574e+307);
test_math_asinh(-295);
