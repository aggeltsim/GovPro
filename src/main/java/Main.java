import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {
        // Incomes List
        ArrayList <Income> incomes = new ArrayList<>();
        
        var taxes_111 = new Taxes();  //Taxes on goods and services
        var taxes_112 = new Taxes();  //Taxes and duties on imports
        var taxes_113 = new Taxes();  //Property taxes
        var taxes_114 = new Taxes();  //Other taxes on production
        var taxes_115 = new Taxes();  //Income taxes
        var taxes_116 = new Taxes();  //Capital taxes
        var taxes_119 = new Taxes();  //Other current taxes

        incomes.add(taxes_111);
        incomes.add(taxes_112);
        incomes.add(taxes_113);
        incomes.add(taxes_114);
        incomes.add(taxes_115);
        incomes.add(taxes_116);
        incomes.add(taxes_119);

        var socialcontr_122 = new Social_Contr();  //Other social contributions

        incomes.add(socialcontr_122);

        var transfers_131 = new Transfers();  //Current Internal transfers
        var transfers_132 = new Transfers();  //Current transfers from organizations and member states of EE
        var transfers_133 = new Transfers();  //Current transfers from foreign entities
        var transfers_134 = new Transfers();  //Internal Investments Grants
        var transfers_135 = new Transfers();  //Investments Grants of EE
        var transfers_139 = new Transfers();  //Other capital transfers

        incomes.add(transfers_131);
        incomes.add(transfers_132);
        incomes.add(transfers_133);
        incomes.add(transfers_134);
        incomes.add(transfers_135);
        incomes.add(transfers_139);

        var sales_141 = new Sales();  //Goods Sales
        var sales_142 = new Sales();  //Sales from services
        var sales_143 = new Sales();  //Rents
        var sales_144 = new Sales();  //Supplies 
        var sales_145 = new Sales();  //Directors fees
        var sales_149 = new Sales();  //Other sales

        incomes.add(sales_141);
        incomes.add(sales_142);
        incomes.add(sales_143);
        incomes.add(sales_144);
        incomes.add(sales_145);
        incomes.add(sales_149);

        var other_151 = new Other_Current();  //Incomes from interests
        var other_152 = new Other_Current();  //Distributed corporate income
        var other_153 = new Other_Current();  //Incomes from Natural resource rents
        var other_156 = new Other_Current();  //Incomes from fines, penalties and attributions
        var other_159 = new Other_Current();  //Incomes from expense reimbursements

        incomes.add(other_151);
        incomes.add(other_152);
        incomes.add(other_153);
        incomes.add(other_156);
        incomes.add(other_159);

        var fixedAssets_311 = new Fixed_Assets();  //Incomes from buildings

        incomes.add(fixedAssets_311);

        var deptSecurities_432 = new Dept_Securities();  //Incomes from long-term debt securities

        incomes.add(deptSecurities_432);

        var loans_442 = new Loans();  //Incomes from long-term loans from Recovery Fund resources

        incomes.add(loans_442);

        var securities_451 = new Securities();  //Incomes from listed shares
        var securities_452 = new Securities();  //Incomes from unlisted shares

        incomes.add(securities_451);
        incomes.add(securities_452);

        var currencyLiabilities = new Currency_Liabilities();
         
        incomes.add(currencyLiabilities);

        var deptSecurities_531 = new Dept_Securities_L();
        var deptSecurities_532 = new Dept_Securities_L();

        incomes.add(deptSecurities_531);
        incomes.add(deptSecurities_532);

        var loans_541 = new Loans();  //Incomes form short-term internal loans
        var loans_542 = new Loans();  //Incomes from long-term external loans

        incomes.add(loans_541);
        incomes.add(loans_542);

        var derivatives_571 = new Derivatives();

        incomes.add(derivatives_571);
        
        //End of Incomes List

        //Expenses List
        ArrayList <Expenses> expenses = new ArrayList<>();

        expenses.add(new Employee_B());
        expenses.add(new Social_B());
        expenses.add(new Transfers());
        expenses.add(new Purchases());
        expenses.add(new Subsidies());
        expenses.add(new Interest());
        expenses.add(new Others());
        expenses.add(new Credits());
        expenses.add(new Fixed_Assets());
        expenses.add(new Valuables());
        expenses.add(new Loans_44());
        expenses.add(new Securities());
        expenses.add(new Dept_Securties());
        expenses.add(new Loans_54());

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
