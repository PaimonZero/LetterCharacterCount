
package controller;

import view.MyMenu;
import model.Content;
import model.Validate;

public class Main extends MyMenu{
    Content strData = new Content();
    
    public Main() {
        super("-*-*-*-*Letter and character count*-*-*-*-", 
                new String[] {"Enter your content.", "Count word.", "Count character," ,"Exit!"} );
    }

    public static void main(String[] args) {
        Main hi = new Main();
        hi.run();
    }
    
    @Override
    public void execute(int choice) {
        switch (choice) {
            case 1:
                System.out.println("===========================================================");
                String str = Validate.getString(">>>Enter your content: ");
                strData.setData(str);
                System.out.println("====================================================================");
                break;
            case 2:
                System.out.println("===========================================================");
                if(strData.getData().isEmpty()) {
                    System.out.println("Your content is empty!");
                } else {
                    System.out.println(">Your content: "+ strData.getData());  //Display data
                    int numberOfWord = LetterCharacterCount.countAndDisplayNumberOfWords(strData);
                    System.out.println(">>The total number of words in the content is: "+ numberOfWord);
                }
                System.out.println("====================================================================");
                break;
            case 3:
                System.out.println("===========================================================");
                if(strData.getData().isEmpty()) {
                    System.out.println("Your content is empty!");
                } else {
                    System.out.println(">Your content: "+ strData.getData());  //Display data
                    LetterCharacterCount.countAndDisplayNumberOfCharater(strData);
                }
                System.out.println("====================================================================");
                break;
            case 4:
                System.out.println("Program closing!");
                break;
            default:
                throw new AssertionError();
        }
    }
}
