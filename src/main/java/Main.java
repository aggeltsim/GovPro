/*Core structure of the main method for the GovPro project.
*Parameter values and implementation details will be added later.
 */
import java.util.ArrayList;

import incomes.*;
import expenses.*;
import entities.*;

public class Main {
    public static void main(String args[]) {
        // Incomes List
        ArrayList <Income> inc = new ArrayList<>();

        var tGoods = new TaxGoodsServices();  //Taxes on goods and services
        var tDuties = new TaxDutiesOnImports();  //Taxes and duties on imports
        var tRegular = new TaxRegularRealEstate();  //Property taxes
        var tProduction = new TaxProduction();  //Other taxes on production
        var tIncome = new TaxIncome();  //Income taxes
        var tCapital = new TaxCapital();  //Capital taxes
        var tOther = new TaxOther();  //Other current taxes

        inc.add(tGoods);
        inc.add(tDuties);
        inc.add(tRegular);
        inc.add(tProduction);
        inc.add(tIncome);
        inc.add(tCapital);
        inc.add(tOther);

        var socContr = new SocialContributions();  //Other social contributions

        inc.add(socContr);

        var trCurrent = new TrCurrentDomestic();  //Current Internal transfers
        var trEU = new TrEU();  //Current transfers from organizations and member states of EE
        var trForeign = new TrForeignEntities();  //Current transfers from foreign entities
        var trDomInvest = new TrDomesInvestGrants();  //Internal Investments Grants
        var trEUInvest = new TrEUInvestGrants();  //Investments Grants of EE
        var trOther = new TrOther();  //Other capital transfers

        inc.add(trCurrent);
        inc.add(trEU);
        inc.add(trForeign);
        inc.add(trDomInvest);
        inc.add(trEUInvest);
        inc.add(trOther);


        var sGoods = new SalGoods();  //Goods Sales
        var sServices= new SalServices();  //Sales from services
        var sRents = new SalRents();  //Rents
        var sCommissions = new SalCommissions();  //Supplies 
        var sAdmin = new SalAdministFees();  //Directors fees
        var sOther = new SalOther();  //Other sales

        inc.add(sGoods);
        inc.add(sServices);
        inc.add(sRents);
        inc.add(sCommissions);
        inc.add(sAdmin);
        inc.add(sOther);

        var oInterest = new OciInterest();  //Incomes from interests
        var oCorpInc = new OciCorporateDistribInc();  //Distributed corporate income
        var oNatRent = new OciNaturalResourceRent();  //Incomes from Natural resource rents
        var oFines = new OciFinesPenaltiesAssessments();  //Incomes from fines, penalties and attributions
        var oReimb = new OciReimbursements();  //Incomes from expense reimbursements

        inc.add(oInterest);
        inc.add(oCorpInc);
        inc.add(oNatRent);
        inc.add(oFines);
        inc.add(oReimb);

        var faBuildings = new FixedAssets();  //Incomes from buildings

        inc.add(faBuildings);

        var dsLongTerm = new DeptSecurities();  //Incomes from long-term debt securities

        inc.add(dsLongTerm);

        var lLongTerm1 = new LoansInc44();  //Incomes from long-term loans from Recovery Fund resources

        inc.add(lLongTerm1);

        var secListed = new SsListed();  //Incomes from listed shares
        var secUnlisted = new SsUnlisted();  //Incomes from unlisted shares

        inc.add(secListed);
        inc.add(secUnlisted);

        var lcdInCirculation = new LiabilitiesCurrenDepos();
         
        inc.add(lcdInCirculation);

        var dsShort = new DslShortTerm();
        var dsLong = new DslLongTerm();

        inc.add(dsShort);
        inc.add(dsLong);

        var lShort = new LShortTerm();  //Incomes form short-term internal loans
        var lLong = new LLongTermL2();  //Incomes from long-term external loans

        inc.add(lShort);
        inc.add(lLong);

        var finDerivatives = new FinancDerivatives();

        inc.add(finDerivatives);
        

        //End of Incomes List

        //Expenses List
        ArrayList <Expenses> exp = new ArrayList<>();

        var empBenefits = new EmployeeBenefits();
        var sBenefits = new SocialBenefits();
        var transfers = new TransfersExp();
        var purchases = new Purchases();
        var subsidies = new Subsidies();
        var interests = new Interests();
        var othExpenses = new OtherExpenses();
        var aFunds = new AllocatedFunds();
        var fixAssets = new FixedAssetsExp();
        var valuables = new Valuables();
        var lExp44 = new LoansExp44();
        var sShares = new SecuritySharesExp();
        var dSecurLiabil = new DeptSecurLiabilExp();
        var lExp54 = new LoansExp54();

        exp.add(empBenefits);
        exp.add(sBenefits);
        exp.add(transfers);
        exp.add(purchases);
        exp.add(subsidies);
        exp.add(interests);
        exp.add(othExpenses);
        exp.add(aFunds);
        exp.add(fixAssets);
        exp.add(valuables);
        exp.add(lExp44);
        exp.add(sShares);
        exp.add(dSecurLiabil);
        exp.add(lExp54);

 

        //End of Expenses List

        //Entities List
        ArrayList <Entities> entities = new ArrayList<>();

        entities.add(new Republic());
        entities.add(new Parliament());
        entities.add(new Ministry_Interior());
        entities.add(new Ministry_Foreign());
        entities.add(new Ministry_Defense());
        entities.add(new Ministry_Health());
        entities.add(new Ministry_Justice());
        entities.add(new Ministry_Education());
        entities.add(new Ministry_Culture());
        entities.add(new Ministry_Economy());
        entities.add(new Ministry_Rural());
        entities.add(new Ministry_Environment());
        entities.add(new Ministry_Labor());
        entities.add(new Ministry_Social());
        entities.add(new Ministry_Development());
        entities.add(new Ministry_Infrastructure());
        entities.add(new Ministry_Shipping());
        entities.add(new Ministry_Tourism());
        entities.add(new Ministry_Digital());
        entities.add(new Ministry_Digital());
        entities.add(new Ministry_Immigration());
        entities.add(new Ministry_Civil());
        entities.add(new Ministry_Climate());
        entities.add(new DA_Attica());
        entities.add(new DA_CentralGR());
        entities.add(new DA_Epirus());
        entities.add(new DA_Peloponnese());
        entities.add(new DA_Aegean());
        entities.add(new DA_Crete());
        entities.add(new DA_Macedonia());

        //End of Entities List







    }

    
    }
    
}
