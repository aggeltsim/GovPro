import incomes.*;
import java.math.BigDecimal;
import java.util.ArrayList;
/**
 * Utility class responsible for initializing and populating the application's 
 * income data for the fiscal year 2025.
 * <p>
 * This class functions as a central repository that transforms raw budgetary 
 * revenue data into specialized {@link Income} objects. It categorizes state 
 * revenues into several major streams, including:
 * </p>
 * <ul>
 * <li>Direct and Indirect Taxation</li>
 * <li>Social Contributions and Transfers</li>
 * <li>Sales of Goods, Services, and Natural Resources</li>
 * <li>Financial Transactions, Loans, and Derivatives</li>
 * </ul>
 */
public class ObjectsIncomes {

  public static ArrayList<Income> createObjectsInc() {

    Object[][] data = {
        {"Code", "Name", "Amount"}, // 0
        {"11", "Taxes", new BigDecimal("62055000000")}, // 1
        {"111", "Taxes on Services and Products", new BigDecimal("33667000000")},
        {"112", "Taxes and Duties on Imports", new BigDecimal("362000000")},
        {"113", "Regular Property Taxes", new BigDecimal("2353000000")},
        {"114", "Other Production Taxes", new BigDecimal("355000000")},
        {"115", "Income Tax", new BigDecimal("23719000000")},
        {"116", "Capital Taxes", new BigDecimal("232000000")},
        {"119", "Other Current Taxes", new BigDecimal("1367000000")},
        {"12", "Social Contributions", new BigDecimal("60000000")},
        {"122", "Other Social Contributions", new BigDecimal("60000000")},
        {"13", "Transfers", new BigDecimal("8131000000")},
        {"131", "Current Domestic Transfers", new BigDecimal("322000000")},
        {"132", "Current Transfers from Organizations and Member States", 
        new BigDecimal("15000000")},
        {"133", "Current Transfers from Foreign Entities", new BigDecimal("8000000")},
        {"134", "Domestic Investment Grants", new BigDecimal("35000000")},
        {"135", "Investment Grants from the EU", new BigDecimal("7645000000")},
        {"139", "Other Capital Transfers", new BigDecimal("106000000")},
        {"14", "Sales of Goods and Services", new BigDecimal("2405000000")},
        {"141", "Goods Sales", new BigDecimal("2000000")},
        {"142", "Provision of Services", new BigDecimal("338000000")},
        {"143", "Rents", new BigDecimal("1418000000")},
        {"144", "Supplies", new BigDecimal("445000000")},
        {"145", "Administrative Fees", new BigDecimal("199000000")},
        {"149", "Other Sales", new BigDecimal("3000000")},
        {"15", "Other Current Income", new BigDecimal("2775000000")},
        {"151", "Interest Income", new BigDecimal("588000000")},
        {"152", "Distributed Corporate Income", new BigDecimal("356000000")},
        {"153", "Natural Resource Rents", new BigDecimal("75000000")},
        {"156", "Fines, Penalties and Assessments", new BigDecimal("1102000000")},
        {"159", "Expense Reimbursements", new BigDecimal("654000000")},
        {"31", "Fixed Assets", new BigDecimal("37000000")},
        {"311", "Buildings and Related Infrastructure", new BigDecimal("37000000")},
        {"43", "Debt Securities", new BigDecimal("11000000")},
        {"432", "Long-term Debt Securities", new BigDecimal("11000000")},
        {"44", "Loans", new BigDecimal("20000000")},
        {"442", "Long-term Loans", new BigDecimal("20000000")},
        {"45", "Equity and Investment Fund Shares", new BigDecimal("467000000")},
        {"451", "Listed Shares", new BigDecimal("239000000")},
        {"452", "Unlisted Shares", new BigDecimal("228000000")},
        {"52", "Currency and Deposit Liabilities", new BigDecimal("66000000")},
        {"521", "Currency in Circulation Liabilities", new BigDecimal("66000000")},
        {"53", "Debt Securities (Liabilities)", new BigDecimal("25973000000")},
        {"531", "Short-term Debt Securities", new BigDecimal("17000000000")},
        {"532", "Long-term Debt Securities", new BigDecimal("8973000000")},
        {"54", "Loans", new BigDecimal("1202027000000")},
        {"541", "Short-term Loans", new BigDecimal("1200000000000")},
        {"542", "Long-term Loans", new BigDecimal("2027000000")},
        {"57", "Financial Derivatives", new BigDecimal("800000000")},
        {"571", "Financial Derivatives", new BigDecimal("800000000")}
    };
        
    // Make objects of Taxes
    var  taxGoodsServices = new TaxGoodsServices(
        (String) data[2][0],      // Κωδικός
        (String) data[2][1],      // Ονομασία
        (BigDecimal) data[2][2],  // Ποσό
        "2025"); // Έτος             // Taxes on Goods and Services
        
    var taxDuties = new TaxDutiesOnImports(
        (String) data[3][0],      // Κωδικός
        (String) data[3][1],      // Ονομασία
        (BigDecimal) data[3][2],  // Ποσό
        "2025"); // Έτος      // Taxes and duties on imports
    
    var taxRegular = new TaxRegularRealEstate(
        (String) data[4][0],     // Κωδικός
        (String) data[4][1],      // Ονομασία
        (BigDecimal) data[4][2],  // Ποσό
        "2025"); // Έτος       // Property taxes
    
    var taxProduction = new TaxProduction(
        (String) data[5][0],      // Κωδικός
        (String) data[5][1],      // Ονομασία
        (BigDecimal) data[5][2],  // Ποσό
        "2025"); // Έτος     // Other taxes on production
    
    var taxIncome = new TaxIncome(
        (String) data[6][0],      // Κωδικός
        (String) data[6][1],      // Ονομασία
        (BigDecimal) data[6][2],  // Ποσό
        "2025"); // Έτος      // Income taxes
    
    var taxCapital = new TaxCapital((String) data[7][0],      // Κωδικός
        (String) data[7][1],      // Ονομασία
        (BigDecimal) data[7][2],  // Ποσό
        "2025");  // Capital taxes
    
    var taxOther = new TaxOther((String) data[8][0],      // Κωδικός
        (String) data[8][1],      // Ονομασία
        (BigDecimal) data[8][2],  // Ποσό
        "2025");  // Other current taxes
    
    // Make objects of Sales
    
    var salGoods = new SalGoods(
        (String) data[19][0], // "141"
        (String) data[19][1],
        (BigDecimal) data[19][2],
        "2025");
    
    var salServices = new SalServices(
        (String) data[20][0], // "142"
        (String) data[20][1],
        (BigDecimal) data[20][2],
        "2025");
    
    var salRents = new SalRents(
        (String) data[21][0], // "143"
        (String) data[21][1],
        (BigDecimal) data[21][2],
        "2025");
    
    var salCommissions = new SalCommissions(
        (String) data[22][0], // "144"
        (String) data[22][1],
        (BigDecimal) data[22][2],
        "2025");
    
    var salAdmin = new SalAdministFees(
        (String) data[23][0], // "145"
        (String) data[23][1],
        (BigDecimal) data[23][2],
        "2025");
    
    var salOther = new SalOther(
        (String) data[24][0], // "149"
        (String) data[24][1],
        (BigDecimal) data[24][2],
        "2025");
    
    // Make objects of Other Current Income
    
    var ociInterest = new OciInterest(
        (String) data[26][0], // "151"
        (String) data[26][1],
        (BigDecimal) data[26][2],
        "2025");
    
    var ociCorpInc = new OciCorporateDistribInc(
        (String) data[27][0], // "152"
        (String) data[27][1],
        (BigDecimal) data[27][2],
        "2025");
    
    var ociNatRent = new OciNaturalResourceRent(
        (String) data[28][0], // "153"
        (String) data[28][1],
        (BigDecimal) data[28][2],
        "2025");
    
    var ociFines = new OciFinesPenaltiesAssessments(
        (String) data[29][0], // "156"
        (String) data[29][1],
        (BigDecimal) data[29][2],
        "2025");
    
    var ociReimb = new OciReimbursements(
        (String) data[30][0], // "159"
        (String) data[30][1],
        (BigDecimal) data[30][2],
        "2025");
    
    // Make object of social contributions
    
    var socContr = new SocialContributions(
        (String) data[11][0], 
        (String) data[11][1],
        (BigDecimal) data[11][2],
        "2025");
    
    // Make Object for Fixed Assets
    
    var faBuildings = new FixedAssets(
        (String) data[33][0], // "159"
        (String) data[33][1],
        (BigDecimal) data[33][2],
        "2025");
    
    // Make object for Dept Securities
    
    var dsLongTerm = new DeptSecurities(
        (String) data[35][0], 
        (String) data[35][1],
        (BigDecimal) data[35][2],
        "2025");
    
    // Make object for Loans with code 44
    
    var loanLongTerm1 = new LoansInc44(
        (String) data[36][0], // "156"
        (String) data[36][1],
        (BigDecimal) data[36][2],
        "2025");
       
    // Make objects for Equity and Investment Fund Shares
    
    var secListed = new SsListed(
        (String) data[38][0], 
        (String) data[38][1],
        (BigDecimal) data[38][2],
        "2025");
    
    var secUnlisted = new SsUnlisted(
        (String) data[39][0], 
        (String) data[39][1],
        (BigDecimal) data[39][2],
        "2025");
    
    // make object for circulation
     
    var lcdInCirculation = new LiabilitiesCurrenDepos(
        (String) data[41][0], 
        (String) data[41][1],
        (BigDecimal) data[41][2],
        "2025");
    
    var dsShort = new DslShortTerm(
        (String) data[43][0], 
        (String) data[43][1],
        (BigDecimal) data[43][2],
        "2025");
    
    var dsLong = new DslLongTerm(
        (String) data[44][0], 
        (String) data[44][1],
        (BigDecimal) data[44][2],
        "2025");
    
    var loanShort = new LShortTerm(// Incomes form short-term internal loans
        (String) data[46][0], 
        (String) data[46][1],
        (BigDecimal) data[46][2],
        "2025");
      
    
    var loanLong = new LLongTermL2(// Incomes from long-term external loans
        (String) data[46][0], 
        (String) data[46][1],
        (BigDecimal) data[46][2],
        "2025");  
    
    var finDerivatives = new FinancDerivatives(
        (String) data[49][0], 
        (String) data[49][1],
        (BigDecimal) data[49][2],
        "2025");

    // Make objects for Transfers
    var trCurrent = new TrCurrentDomestic(
        (String) data[13][0],
        (String) data[13][1],
        (BigDecimal) data[13][2],
        "2025");

    var trEu = new TrEU(
        (String) data[14][0],
        (String) data[14][1],
        (BigDecimal) data[14][2],
        "2025");

    var trForeign = new TrForeignEntities(
        (String) data[15][0],
        (String) data[15][1],
        (BigDecimal) data[15][2],
        "2025");

    var trDomInvest = new TrDomesInvestGrants(
        (String) data[16][0],
        (String) data[16][1],
        (BigDecimal) data[16][2],
        "2025");

    var trEuInvest = new TrEUInvestGrants(
        (String) data[17][0],
        (String) data[17][1],
        (BigDecimal) data[17][2],
        "2025");

    var trOther = new TrOther(
        (String) data[18][0],
        (String) data[18][1],
        (BigDecimal) data[18][2],
        "2025");

    /**
     * Creates and returns an exhaustive list of {@link Income} objects based 
     * on the 2025 State Budget revenue projections.
     * <p>
     * The method instantiates concrete subclasses of the Income model (e.g., 
     * {@link TaxIncome}, {@link SalServices}, {@link TrEU}), ensuring that 
     * each revenue stream is tracked with its official budget code and 
     * precise {@link BigDecimal} amount.
     * </p>
     * * @return An {@link ArrayList} of {@link Income} objects representing 
     * all projected state revenue sources for 2025.
     * @see Income
     * @see TaxIncome
     * @see SocialContributions
     */
    ArrayList<Income> inc = new ArrayList<>();

    inc.add(taxGoodsServices);
    inc.add(taxDuties);
    inc.add(taxRegular);
    inc.add(taxProduction);
    inc.add(taxIncome);
    inc.add(taxCapital);
    inc.add(taxOther);
    inc.add(socContr);
    inc.add(trCurrent);
    inc.add(trEu);
    inc.add(trForeign);
    inc.add(trDomInvest);
    inc.add(trEuInvest);
    inc.add(trOther);
    inc.add(salGoods);
    inc.add(salServices);
    inc.add(salRents);
    inc.add(salCommissions);
    inc.add(salAdmin);
    inc.add(salOther);
    inc.add(ociInterest);
    inc.add(ociCorpInc);
    inc.add(ociNatRent);
    inc.add(ociFines);
    inc.add(ociReimb);
    inc.add(faBuildings);
    inc.add(dsLongTerm);
    inc.add(loanLongTerm1);
    inc.add(secListed);
    inc.add(secUnlisted);
    inc.add(lcdInCirculation);
    inc.add(dsShort);
    inc.add(dsLong);
    inc.add(loanShort);
    inc.add(loanLong);
    inc.add(finDerivatives);
        

    // End of Incomes List
    return inc;
  }
}
