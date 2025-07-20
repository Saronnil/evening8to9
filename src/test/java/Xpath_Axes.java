public class Xpath_Axes {
    public static void main (String []args){

        // following-sibling -  selects all siblings after the current node
        //label[text()='Address']/following-sibling::div/textarea

        // Following - below the particular element
        //label[text()='Address']/following::input[@type='email']

        //Parent - Selects the parent of the current node
        //input[@type='tel']/parent::div

        // preceding -sibling - Selects all siblings before current node
        //input[@ng-model='LastName']/parent::div/preceding-sibling::div/input

//        Descendant : Selects all descendants (children,grandchildren,etc) of current node.
        //form[@id='basicBootstrapForm']/descendant::input[@type='text' or @type='email' or @type='tel']

// preceding above the particular element

        //label[text()='Country*']/preceding::select[@type='text']

        // ancestor - selects all ancestors (parent , grandparent)
//input[@type='text' and @ng-model='FirstName']/ancestor::div[@class='form-group']




    }
}
