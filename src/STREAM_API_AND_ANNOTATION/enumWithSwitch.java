package STREAM_API_AND_ANNOTATION;

import javax.swing.plaf.synth.SynthOptionPaneUI;

enum switchExample{
    PASS,FAIL,NR;

}
public class enumWithSwitch {
    public static void main(String[] args) {

        switchExample res=switchExample.PASS;

        switch (res){
            case PASS:
                System.out.println("passed !");
                break;
            case FAIL:
                System.out.println("Failed");
                break;
            default:
                System.out.println("Nothing matched");
        }
    }

}
