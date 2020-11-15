
package kata4.main;

import kata4.ui.MailHistogramBuilder;
import kata4.ui.MailListReader;
import kata4.ui.HistogramDisplay;
import kata4.model.Mail;
import kata4.model.Histogram;
import java.util.List;

public class Kata4 {
    private static List<Mail> mailList;
    private static Histogram <String> mailHistogram;
    
    public static void main(String[] args) {
        String fileName = new String("./files/emails.txt");
        mailList = MailListReader.read(fileName);
        mailHistogram = MailHistogramBuilder.build(mailList);
        new HistogramDisplay("HISTOGRAMA",mailHistogram).execute();
    }
}
