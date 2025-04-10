public class Xpath_Axes {
    public static void main (String []args){

        // following-sibling -  selects all siblings after the current node
        //label[text()='Address']/following-sibling::div/textarea

        // Following
        //label[text()='Address']/following::input[@type='email']

        //Parent - Selects the parent of the current node
        //input[@type='tel']/parent::div

        // preceding -sibling - Selects all siblings before current node
        //input[@ng-model='LastName']/parent::div/preceding-sibling::div/input

//        Descendant : Selects all descendants (children,grandchildren,etc) of current node.

        
    }
}
