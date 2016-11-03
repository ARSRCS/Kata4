/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class MailHistogramBuilder {
    public static Histogram<String> build(ArrayList<String> mail){
        Histogram<String> histo = new Histogram<>();
        for (String mail1 : mail) {
            histo.increment(new Mail(mail1).getDomain());
        }
        return histo;
    }
}
