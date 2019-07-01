package org.agmip.tools.unithelper;

import java.math.BigDecimal;
import junit.framework.Assert;
//import org.junit.Assert;
import org.junit.Test;
import ucar.units.ConversionException;
import ucar.units.NoSuchUnitException;
import ucar.units.PrefixDBException;
import ucar.units.SpecificationException;
import ucar.units.UnitDBException;
import ucar.units.UnitParseException;
import ucar.units.UnitSystemException;

/**
 *
 * @author Meng Zhang
 */
public class UnitConverterTest {

    private static String[] base = {
        "number", "counts", "unitless", "fraction", "code", "ratio",
        "year", "month", "mo", "day", "h", "hr", "hour", "d", "min",
        "degF", "degC",
        "km", "m", "cm", "mm",
        "g", "kg", "mg", "Mg", "lb", "ton", "t",
        "ha", "m2", "cm2", "mm2", "km2",
        "L", "l", "m3", "cm3", "mm3",
        "percent", "%", "ppm", "ppb", "vpm",
        "cmol", "mmol",
        "MJ",
        "degree angle",
        "seimen",
        "Pa",
        "plant", "unit", "eye", "leaf", "corm", "shoot", "ear"
    };
    private static String[] from = {

        "number", "year", "date", "m2", "m",
//        "degree angle",
        "arc_degree",
        "cm", "days", "decimal degrees", "percent", "day", "1/d", "g/cm3", "%", "mg/kg", "cmol/kg", "g[C]/100g[soil]",
//        "doy",
        "day",
        "kg/ha", "mm", "kg[N]/ha", "counts/cm3", "unitless", "ppm",
//        "oC", "C",
        "degC",
//        "#/m2",
        "number/m2",
        "kg[P]/ha", "kg[K]/ha", "fraction", "h",
//        "MJ/m2.d",
        "MJ/m2/d",
        "km/d", "m2/m2", "kg[OM]/ha", "cm3/cm3", "cm/h", "1/cm", "g/Mg", "mmol/kg", "mmol/l", "g/kg", "ppb", "seimen", "vpm",
//        "kPa/°C",
        "kPa/degC",
        "1/mm2", "mm/mo", "number/month",
//        "mole/m2.d",
        "mole/m2/d",
        "hr", "mm/d", "kPa",
//        "dap",
        "code", "g/eye", "g/m2", "g/plant", "g/unit", "kg/hl", "l/kg", "mg", "mg/ha", "t/ha", "kg[water]/kg[harvest]", "%/day", "cm/cm2", "cm/g", "cm2", "cm2/g", "cm2/leaf", "cm2/plant", "g", "g/cm", "g/corm",
        "g/m2.d", "g/plant.d", "g/shoot", "kg/ha.d", "mg/cm2", "mg/m2.s", "number/day", "number/plant", "number/shoot", "number/ear", "ratio", "g/cm2", "cm/cm3", "g/MJ", "mg/l", "cm/cm2.d", "cm/cm3.d", "cm2/m2.d", "m2/m2.d", "number/m", "number/m2.d",};
    private static String[] to = {};
    private static double[] val = {};
    private static String[] expected = {};

    @Test
    public void testAgMIPUnit() throws UnitParseException, SpecificationException, NoSuchUnitException, UnitDBException, PrefixDBException, UnitSystemException {
//        for (String unit : from) {
//            System.out.print("Test "+ unit + " ...");
//            System.out.println("Assert.assertEquals(\"" + unit + "\", \"" + UnitConverter.getDescp(unit)+ "\", UnitConverter.getDescp(\"" + unit + "\"));");
//        }
        
        Assert.assertEquals("number", "count", UnitConverter.getDescp("number"));
        Assert.assertEquals("year", "3.15569259747E7 s", UnitConverter.getDescp("year"));
//        Assert.assertEquals("date", "", UnitConverter.getDescp("date"));
        Assert.assertEquals("m2", "m2", UnitConverter.getDescp("m2"));
        Assert.assertEquals("m", "meter", UnitConverter.getDescp("m"));
//        Assert.assertEquals("degree angle", "0.017453292519943295 rad", UnitConverter.getDescp("degree angle"));
        Assert.assertEquals("arc_degree", "0.017453292519943295 rad", UnitConverter.getDescp("arc_degree"));
        Assert.assertEquals("cm", "0.01 m", UnitConverter.getDescp("cm"));
        Assert.assertEquals("days", "86400.0 s", UnitConverter.getDescp("days"));
        Assert.assertEquals("decimal_degree", "0.017453292519943295 rad", UnitConverter.getDescp("decimal_degree"));
        Assert.assertEquals("percent", "0.01", UnitConverter.getDescp("percent"));
        Assert.assertEquals("day", "86400.0 s", UnitConverter.getDescp("day"));
        Assert.assertEquals("doy", "86400.0 s", UnitConverter.getDescp("doy"));
        Assert.assertEquals("1/d", "1.1574074074074073E-5 s-1", UnitConverter.getDescp("1/d"));
        Assert.assertEquals("g/cm3", "999.9999999999999 kg.m-3", UnitConverter.getDescp("g/cm3"));
        Assert.assertEquals("%", "0.01", UnitConverter.getDescp("%"));
        Assert.assertEquals("mg/kg", "1.0E-6", UnitConverter.getDescp("mg/kg"));
        Assert.assertEquals("cmol/kg", "0.01 kg-1.mol", UnitConverter.getDescp("cmol/kg"));
        Assert.assertEquals("g[C]/100g[soil]", "0.001 kg", UnitConverter.getDescp("g[C]/100g[soil]"));
        Assert.assertEquals("day", "86400.0 s", UnitConverter.getDescp("day"));
        Assert.assertEquals("kg/ha", "1.0E-4 kg.m-2", UnitConverter.getDescp("kg/ha"));
        Assert.assertEquals("mm", "0.001 m", UnitConverter.getDescp("mm"));
        Assert.assertEquals("kg[N]/ha", "1.0E-4 kg.m-2", UnitConverter.getDescp("kg[N]/ha"));
        Assert.assertEquals("counts/cm3", "999999.9999999999 m-3", UnitConverter.getDescp("counts/cm3"));
        Assert.assertEquals("unitless", "unitless", UnitConverter.getDescp("unitless"));
        Assert.assertEquals("ppm", "1.0E-6", UnitConverter.getDescp("ppm"));
        Assert.assertEquals("degC", "(K) @ 273.15", UnitConverter.getDescp("degC"));
        Assert.assertEquals("number/m2", "m-2", UnitConverter.getDescp("number/m2"));
//        Assert.assertEquals("#/m2", "1.0E-18 ber.m-2", UnitConverter.getDescp("#/m2"));
        Assert.assertEquals("kg[P]/ha", "1.0E-4 kg.m-2", UnitConverter.getDescp("kg[P]/ha"));
        Assert.assertEquals("kg[K]/ha", "1.0E-4 kg.m-2", UnitConverter.getDescp("kg[K]/ha"));
        Assert.assertEquals("fraction", "fraction", UnitConverter.getDescp("fraction"));
        Assert.assertEquals("h", "3600.0 s", UnitConverter.getDescp("h"));
        Assert.assertEquals("MJ/m2/d", "11.574074074074074 kg.s-3", UnitConverter.getDescp("MJ/m2/d"));
        Assert.assertEquals("km/d", "0.011574074074074073 m.s-1", UnitConverter.getDescp("km/d"));
        Assert.assertEquals("m2/m2", "", UnitConverter.getDescp("m2/m2"));
        Assert.assertEquals("kg[OM]/ha", "1.0E-4 kg.m-2", UnitConverter.getDescp("kg[OM]/ha"));
        Assert.assertEquals("cm3/cm3", "1.0", UnitConverter.getDescp("cm3/cm3"));
        Assert.assertEquals("cm/h", "2.777777777777778E-6 m.s-1", UnitConverter.getDescp("cm/h"));
        Assert.assertEquals("1/cm", "100.0 m-1", UnitConverter.getDescp("1/cm"));
        Assert.assertEquals("g/Mg", "1.0E-6", UnitConverter.getDescp("g/Mg"));
        Assert.assertEquals("mmol/kg", "0.001 kg-1.mol", UnitConverter.getDescp("mmol/kg"));
        Assert.assertEquals("mmol/l", "1.0 m-3.mol", UnitConverter.getDescp("mmol/l"));
        Assert.assertEquals("g/kg", "0.001", UnitConverter.getDescp("g/kg"));
        Assert.assertEquals("ppb", "1.0E-9", UnitConverter.getDescp("ppb"));
        Assert.assertEquals("seimens", "", UnitConverter.getDescp("seimens"));
//        Assert.assertEquals("vpm", "vpm", UnitConverter.getDescp("vpm"));
//        Assert.assertEquals("kPa/°C", "1000.0 K-1.kg.m-1.s-2", UnitConverter.getDescp("kPa/°C"));
        Assert.assertEquals("kPa/degC", "1000.0 K-1.kg.m-1.s-2", UnitConverter.getDescp("kPa/degC"));
        Assert.assertEquals("1/mm2", "1000000.0 m-2", UnitConverter.getDescp("1/mm2"));
        Assert.assertEquals("mm/mo", "1.0 m.o-1", UnitConverter.getDescp("mm/mo"));
        Assert.assertEquals("number/month", "3.802651756898219E-7 s-1", UnitConverter.getDescp("number/month"));
//        Assert.assertEquals("mole/m2.d", "1.1574074074074073E-5 m-2.mol.s-1", UnitConverter.getDescp("mole/m2.d"));
        Assert.assertEquals("mole/m2/d", "1.1574074074074073E-5 m-2.mol.s-1", UnitConverter.getDescp("mole/m2/d"));
        Assert.assertEquals("hr", "3600.0 s", UnitConverter.getDescp("hr"));
        Assert.assertEquals("mm/d", "1.1574074074074074E-8 m.s-1", UnitConverter.getDescp("mm/d"));
        Assert.assertEquals("kPa", "1000.0 Pa", UnitConverter.getDescp("kPa"));
        Assert.assertEquals("dap", "86400.0 s", UnitConverter.getDescp("dap"));
//        Assert.assertEquals("code", "0.01 ode", UnitConverter.getDescp("code"));
        Assert.assertEquals("g/eye", "0.001 eye-1.kg", UnitConverter.getDescp("g/eye")); //TODO
        Assert.assertEquals("g/m2", "0.001 kg.m-2", UnitConverter.getDescp("g/m2"));
        Assert.assertEquals("g/plant", "0.001 kg", UnitConverter.getDescp("g/[plant]"));
        Assert.assertEquals("g/unit", "0.001 kg", UnitConverter.getDescp("g/[unit]"));
        Assert.assertEquals("kg/hl", "10.0 kg.m-3", UnitConverter.getDescp("kg/hl")); // TODO typo?
        Assert.assertEquals("l/kg", "0.001 kg-1.m3", UnitConverter.getDescp("l/kg"));
        Assert.assertEquals("mg", "1.0E-6 kg", UnitConverter.getDescp("mg"));
        Assert.assertEquals("mg/ha", "9.999999999999999E-11 kg.m-2", UnitConverter.getDescp("mg/ha"));
        Assert.assertEquals("t/ha", "0.1 kg.m-2", UnitConverter.getDescp("t/ha"));
        Assert.assertEquals("kg[water]/kg[harvest]", "kilogram", UnitConverter.getDescp("kg[water]/kg[harvest]"));
        Assert.assertEquals("%/day", "1.1574074074074074E-7 s-1", UnitConverter.getDescp("%/day"));
        Assert.assertEquals("cm/cm2", "100.0 m-1", UnitConverter.getDescp("cm/cm2"));
        Assert.assertEquals("cm/g", "10.0 kg-1.m", UnitConverter.getDescp("cm/g"));
        Assert.assertEquals("cm2", "1.0E-4 m2", UnitConverter.getDescp("cm2"));
        Assert.assertEquals("cm2/g", "0.1 kg-1.m2", UnitConverter.getDescp("cm2/g"));
        Assert.assertEquals("cm2/leaf", "1.0E-4 leaf-1.m2", UnitConverter.getDescp("cm2/leaf"));  // TODO
        Assert.assertEquals("cm2/plant", "1.0E8 lant-1.m2", UnitConverter.getDescp("cm2/plant"));  // TODO
        Assert.assertEquals("g", "0.001 kg", UnitConverter.getDescp("g"));
        Assert.assertEquals("g/cm", "0.1 kg.m-1", UnitConverter.getDescp("g/cm"));
        Assert.assertEquals("g/[corm]", "0.001 kg", UnitConverter.getDescp("g/[corm]"));
//        Assert.assertEquals("g/m2.d", "86.4 kg.m-2.s", UnitConverter.getDescp("g/m2.d"));
        Assert.assertEquals("g/m2/d", "1.1574074074074074E-8 kg.m-2.s-1", UnitConverter.getDescp("g/m2/d"));
        Assert.assertEquals("g.[plant]-1.d-1", "1.1574074074074074E-8 kg.s-1", UnitConverter.getDescp("g.[plant]-1.d-1"));
        Assert.assertEquals("g/[plant]/d", "1.1574074074074074E-8 kg.s-1", UnitConverter.getDescp("g/[plant-1]/d"));
        Assert.assertEquals("g/[shoot]", "0.001 kg", UnitConverter.getDescp("g/[shoot]"));
//        Assert.assertEquals("kg/ha.d", "8.64 kg.m-2.s", UnitConverter.getDescp("kg/ha.d"));
        Assert.assertEquals("kg/ha/d", "1.1574074074074074E-9 kg.m-2.s-1", UnitConverter.getDescp("kg/ha/d"));
        Assert.assertEquals("mg/cm2", "0.009999999999999998 kg.m-2", UnitConverter.getDescp("mg/cm2"));
//        Assert.assertEquals("mg/m2.s", "1.0E-6 kg.m-2.s", UnitConverter.getDescp("mg/m2.s"));
        Assert.assertEquals("mg/m2/s", "1.0E-6 kg.m-2.s-1", UnitConverter.getDescp("mg/m2/s"));
        Assert.assertEquals("number/day", "1.1574074074074073E-5 s-1", UnitConverter.getDescp("number/day"));
        Assert.assertEquals("number/[plant]", "count", UnitConverter.getDescp("number/[plant]"));
        Assert.assertEquals("number/[shoot]", "count", UnitConverter.getDescp("number/[shoot]"));
        Assert.assertEquals("number/[ear]", "count", UnitConverter.getDescp("number/[ear]"));
        Assert.assertEquals("ratio", "ratio", UnitConverter.getDescp("ratio"));
        Assert.assertEquals("g/cm2", "10.0 kg.m-2", UnitConverter.getDescp("g/cm2"));
        Assert.assertEquals("cm/cm3", "9999.999999999998 m-2", UnitConverter.getDescp("cm/cm3"));
        Assert.assertEquals("g/MJ", "1.0E-9 m-2.s2", UnitConverter.getDescp("g/MJ"));
        Assert.assertEquals("mg/l", "0.001 kg.m-3", UnitConverter.getDescp("mg/l"));
//        Assert.assertEquals("cm/cm2.d", "8640000.0 m-1.s", UnitConverter.getDescp("cm/cm2.d"));
        Assert.assertEquals("cm/cm2/d", "0.0011574074074074073 m-1.s-1", UnitConverter.getDescp("cm/cm2/d"));
//        Assert.assertEquals("cm/cm3.d", "8.639999999999999E8 m-2.s", UnitConverter.getDescp("cm/cm3.d"));
        Assert.assertEquals("cm/cm3/d", "0.11574074074074071 m-2.s-1", UnitConverter.getDescp("cm/cm3/d"));
//        Assert.assertEquals("cm2/m2.d", "8.64 s", UnitConverter.getDescp("cm2/m2.d"));
        Assert.assertEquals("cm2/m2/d", "1.1574074074074074E-9 s-1", UnitConverter.getDescp("cm2/m2/d"));
//        Assert.assertEquals("m2/m2.d", "86400.0 s", UnitConverter.getDescp("m2/m2.d"));
        Assert.assertEquals("m2/m2/d", "1.1574074074074073E-5 s-1", UnitConverter.getDescp("m2/m2/d"));
//        Assert.assertEquals("number/m", "1.0E-18 ber.m-1", UnitConverter.getDescp("number/m"));
//        Assert.assertEquals("number/m2.d", "8.64E-14 ber.m-2.s", UnitConverter.getDescp("number/m2.d"));
//        Assert.assertEquals("number/m2/d", "8.64E-14 ber.m-2.s", UnitConverter.getDescp("number/m2/d"));
        
    }
    
//    @Test
    public void testBaseUnit() throws UnitParseException, SpecificationException, NoSuchUnitException, UnitDBException, PrefixDBException, UnitSystemException {
        for (String unit : base) {
            System.out.println("Test "+ unit + " ...");
            Assert.assertTrue(unit, UnitConverter.isValid(unit));
            System.out.println("\t" + UnitConverter.getDescp(unit));
        }
    }
    
    @Test
    public void testUnitStrFormat() throws UnitParseException, SpecificationException, NoSuchUnitException, UnitDBException, PrefixDBException, UnitSystemException, ConversionException  {
        Assert.assertEquals("1", UnitConverter.convert("m2", "m^2", "1").toPlainString());
        Assert.assertEquals("1", UnitConverter.convert("g/m2/s", "g/(m^2s)", "1").toPlainString());
        Assert.assertEquals("3600", UnitConverter.convert("g/m2/s", "g/m2/h", "1", 0).toPlainString());
        Assert.assertEquals("1", UnitConverter.convert("mole/m2/d", "mole/(m2.d)", "1").toPlainString());
        Assert.assertEquals("0.01", UnitConverter.convert("cm", "m", "1").toPlainString());
    }
    
    @Test
    public void testComments() {
        Assert.assertEquals("g.d-1", UnitConverter.removeComment("g.[plant]-1.d-1"));
        Assert.assertEquals("g.d-1", UnitConverter.removeComment("g.[plant]^-2.d-1"));
        Assert.assertEquals("g.d-1", UnitConverter.removeComment("g.[plant]^2.d-1"));
        Assert.assertEquals("g/d", UnitConverter.removeComment("g/[plant]/d"));
        Assert.assertEquals("g/d", UnitConverter.removeComment("g/[plant]^2/d"));
        Assert.assertEquals("g/d", UnitConverter.removeComment("g/[plant]^-2/d"));
    }
}
