package MoneyRec.src;

import static org.junit.Assert.*;

import org.junit.Test;

public class exampleTest {

	@Test
	public void test() {
		String[] args={"BasicIndustries.csv","C:\\Users\\hp\\Dropbox\\msprojects\\ubhack\\idfile\\BasicIndustriesid.csv"};
		try {
			MoneyRecApi.main(args);
			args[0]="communications.csv";
			args[1]="C:\\Users\\hp\\Dropbox\\msprojects\\ubhack\\idfile\\communicationsid.csv";
			MoneyRecApi.main(args);
			
			args[0]="ConsumerDeliverables.csv";
			args[1]="C:\\Users\\hp\\Dropbox\\msprojects\\ubhack\\idfile\\ConsumerDeliverablesid.csv";
			MoneyRecApi.main(args);
			
			args[0]="ConsumerNonDurables.csv";
			args[1]="C:\\Users\\hp\\Dropbox\\msprojects\\ubhack\\idfile\\ConsumerNonDurablesid.csv";
			MoneyRecApi.main(args);
			
			args[0]="ConsumerServices.csv";
			args[1]="C:\\Users\\hp\\Dropbox\\msprojects\\ubhack\\idfile\\ConsumerServicesid.csv";
			MoneyRecApi.main(args);
			
			args[0]="Energy.csv";
			args[1]="C:\\Users\\hp\\Dropbox\\msprojects\\ubhack\\idfile\\Energyid.csv";
			MoneyRecApi.main(args);
			
			args[0]="Finance.csv";
			args[1]="C:\\Users\\hp\\Dropbox\\msprojects\\ubhack\\idfile\\Financeid.csv";
			MoneyRecApi.main(args);
			
			args[0]="Healthcare.csv";
			args[1]="C:\\Users\\hp\\Dropbox\\msprojects\\ubhack\\idfile\\Healthcareid.csv";
			MoneyRecApi.main(args);
			
			args[0]="Miscellaneous.csv";
			args[1]="C:\\Users\\hp\\Dropbox\\msprojects\\ubhack\\idfile\\Miscellaneousid.csv";
			MoneyRecApi.main(args);
			
			args[0]="Technology.csv";
			args[1]="C:\\Users\\hp\\Dropbox\\msprojects\\ubhack\\idfile\\Technologyid.csv";
			MoneyRecApi.main(args);
			
			args[0]="Transportation.csv";
			args[1]="C:\\Users\\hp\\Dropbox\\msprojects\\ubhack\\idfile\\Transportationid.csv";
			MoneyRecApi.main(args);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
