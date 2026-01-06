import entities.*;
import java.math.BigDecimal;
import java.util.ArrayList;


public class ObjectsEntities {
  public static ArrayList<Entity> createObjectsEnt() {
    Object[][] data = {
        {"Code", "Name", "Amount"}, // 0
        {"1001", "Presidency of the Republic", new BigDecimal("4638000")}, //1
        {"1003", "Hellenic Parliament", new BigDecimal("171950000")},
        {"1004", "Presidency of the Government", new BigDecimal("41689000")},
        {"1007", "Ministry of Interior", new BigDecimal("3830276000")},
        {"1009", "Ministry of Foreign Affairs", new BigDecimal("420237000")},
        {"1011", "Ministry of National Defense", new BigDecimal("6130000000")},
        {"1015", "Ministry of Health", new BigDecimal("7177424000")},
        {"1017", "Ministry of Justice", new BigDecimal("650803000")},
        {"1020", "Ministry of Education, Religious Affairs", new BigDecimal("6606000000")},
        {"1022", "Ministry of Culture", new BigDecimal("575419000")},
        {"1024", "Ministry of National Economy", new BigDecimal("1246518464000")},
        {"1029", "Ministry of Rural Development and Food", new BigDecimal("1281403000")},
        {"1031", "Ministry of Environment and Energy", new BigDecimal("2341227000")},
        {"1032", "Ministry of Labor and Social Security", new BigDecimal("18678084000")},
        {"1034", "Ministry of Social Cohesion", new BigDecimal("3989553000")},
        {"1036", "Ministry of Development", new BigDecimal("818045000")},
        {"1039", "Ministry of Infrastructure and Transport", new BigDecimal("2694810000")},
        {"1041", "Ministry of Shipping and Island Policy", new BigDecimal("651864000")},
        {"1045", "Ministry of Tourism", new BigDecimal("189293000")},
        {"1053", "Ministry of Digital Governance", new BigDecimal("1073928000")},
        {"1055", "Ministry of Migration and Asylum", new BigDecimal("475871000")},
        {"1057", "Ministry of Citizen Protection", new BigDecimal("2285820000")},
        {"1060", "Ministry of Climate Crisis and Civil Protection", new BigDecimal("1221116000")},
        {"1901", "Decentralized Administration of Attica", new BigDecimal("13091000")},
        {"1902", "Decentralized Administration of Thessaly-Central Greece", 
        new BigDecimal("10579000")},
        {"1903", "Decentralized Administration of Epirus-Western Greece", 
        new BigDecimal("9943000")},
        {"1904", "Decentralized Administration of Peloponnese", new BigDecimal("14918000")},
        {"1905", "Decentralized Administration of the Aegean", new BigDecimal("6188000")},
        {"1906", "Decentralized Administration of Crete", new BigDecimal("6497000")},
        {"1907", "Decentralized Administration of Macedonia - Thrace", new BigDecimal("18376000")}
    };
    // Make Object for Entities (Ministries, Presidency, Parliament and Administration)
    var repPresidency = new RepublicPresidency(
        (String) data[1][0], // "1001"
        (String) data[1][1],
        (BigDecimal) data[1][2],
        "2025");

    var helPar = new HellenicParliament(
        (String) data[2][0], // "1003"
        (String) data[2][1],
        (BigDecimal) data[2][2],
        "2025");

    var govPre = new GovernPresidency(
        (String) data[3][0], // "1004"
        (String) data[3][1],
        (BigDecimal) data[3][2],
        "2025");

    var minInterior = new MinInterior(
        (String) data[4][0], // "1007"
        (String) data[4][1],
        (BigDecimal) data[4][2],
        "2025");

    var minForeign = new MinForeign(
        (String) data[5][0], // "1009"
        (String) data[5][1],
        (BigDecimal) data[5][2],
        "2025");

    var minDefense = new MinDefense(
        (String) data[6][0], // "1011"
        (String) data[6][1],
        (BigDecimal) data[6][2],
        "2025");

    var minHealth = new MinHealth(
        (String) data[7][0], // "1015"
        (String) data[7][1],
        (BigDecimal) data[7][2],
        "2025");

    var minJustice = new MinJustice(
        (String) data[8][0], // "1017"
        (String) data[8][1],
        (BigDecimal) data[8][2],
        "2025");

    var minEducatReligSports = new MinEducatReligSports(
        (String) data[9][0], // "1020"
        (String) data[9][1],
        (BigDecimal) data[9][2],
        "2025");

    var minCulture = new MinCulture(
        (String) data[10][0], // "1022"
        (String) data[10][1],
        (BigDecimal) data[10][2],
        "2025");

    var minEconomy = new MinEconomy(
        (String) data[11][0], // "1024"
        (String) data[11][1],
        (BigDecimal) data[11][2],
        "2025");

    var minRuralDevelFood = new MinRuralDevelFood(
        (String) data[12][0], // "1029"
        (String) data[12][1],
        (BigDecimal) data[12][2],
        "2025");

    var minEnvirEnergy = new MinEnvirEnergy(
        (String) data[13][0], // "1031"
        (String) data[13][1],
        (BigDecimal) data[13][2],
        "2025");

    var minLaborSocSecurity = new MinLaborSocSecurity(
        (String) data[14][0], // "1032"
        (String) data[14][1],
        (BigDecimal) data[14][2],
        "2025");

    var minSocCohesionFam = new MinSocCohesFam(
        (String) data[15][0], // "1034"
        (String) data[15][1],
        (BigDecimal) data[15][2],
        "2025");

    var minDevelopment = new MinDevelopment(
        (String) data[16][0], // "1036"
        (String) data[16][1],
        (BigDecimal) data[16][2],
        "2025");

    var minInfrTransp = new MinInfrastTransport(
        (String) data[17][0], // "1039"
        (String) data[17][1],
        (BigDecimal) data[17][2],
        "2025");

    var minShipIslandPolicy = new MinShipIslandPolicy(
        (String) data[18][0], // "1041"
        (String) data[18][1],
        (BigDecimal) data[18][2],
        "2025");

    var minTourism = new MinTourism(
        (String) data[19][0], // "1045"
        (String) data[19][1],
        (BigDecimal) data[19][2],
        "2025");

    var minDigitalGov = new MinDigitalGovern(
        (String) data[20][0], // "1053"
        (String) data[20][1],
        (BigDecimal) data[20][2],
        "2025");

    var minImmigrAsylum = new MinImmigrAsylum(
        (String) data[21][0], // "1055"
        (String) data[21][1],
        (BigDecimal) data[21][2],
        "2025");

    var minCivilProtect = new MinCivilProtection(
        (String) data[22][0], // "1057"
        (String) data[22][1],
        (BigDecimal) data[22][2],
        "2025");

    var minClimaCrisis = new MinClimateCrisis(
        (String) data[23][0], // "1060"
        (String) data[23][1],
        (BigDecimal) data[23][2],
        "2025");

    // ==== DECENTRALIZED ADMINISTRATIONS ====

    var decAdmAttica = new DecAdminAttica(
        (String) data[24][0], // "1901"
        (String) data[24][1],
        (BigDecimal) data[24][2],
        "2025");

    var decAdminThesCenGr = new DecAdminThesCenGr(
        (String) data[25][0], // "1902"
        (String) data[25][1],
        (BigDecimal) data[25][2],
        "2025");

    var decAdmEpirWestMac = new DecAdminEpirWMaced(
        (String) data[26][0], // "1903"
        (String) data[26][1],
        (BigDecimal) data[26][2],
        "2025");

    var decAdminPelopWestGreeceIonio = new DecAdminPelopWGrIon(
        (String) data[27][0], // "1904"
        (String) data[27][1],
        (BigDecimal) data[27][2],
        "2025");

    var decAdmAegean = new DecAdminAegean(
        (String) data[28][0], // "1905"
        (String) data[28][1],
        (BigDecimal) data[28][2],
        "2025");

    var decAdmCrete = new DecAdminCrete(
        (String) data[29][0], // "1906"
        (String) data[29][1],
        (BigDecimal) data[29][2],
        "2025");

    var decAdmMacedThr = new DecAdminMacedThr(
        (String) data[30][0], // "1907"
        (String) data[30][1],
        (BigDecimal) data[30][2],
        "2025");

    // Entities List
    ArrayList<Entity> ent = new ArrayList<>();

    ent.add(repPresidency);
    ent.add(helPar);
    ent.add(govPre);
    ent.add(minCivilProtect);
    ent.add(minClimaCrisis);
    ent.add(minCulture);
    ent.add(minDefense);
    ent.add(minDevelopment);
    ent.add(minDigitalGov);
    ent.add(minEconomy);
    ent.add(minEducatReligSports);
    ent.add(minEnvirEnergy);
    ent.add(minForeign);
    ent.add(minHealth);
    ent.add(minImmigrAsylum);
    ent.add(minInfrTransp);
    ent.add(minInterior);
    ent.add(minJustice);
    ent.add(minLaborSocSecurity);
    ent.add(minRuralDevelFood);
    ent.add(minShipIslandPolicy);
    ent.add(minSocCohesionFam);
    ent.add(minTourism);
    ent.add(decAdmAegean);
    ent.add(decAdmAttica);
    ent.add(decAdmCrete);
    ent.add(decAdmEpirWestMac);
    ent.add(decAdmMacedThr);
    ent.add(decAdminPelopWestGreeceIonio);
    ent.add(decAdminThesCenGr);
      

    // End of Entities List
    return ent;
  }
    
}