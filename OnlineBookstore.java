
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

// JFRAME GUI
public class OnlineBookstore extends JFrame {
    public OnlineBookstore() {
        initComponents();
    }

 // Declaration and show component on GUI
    private JTextField priceTF = new JTextField();
    private JTextField quantityTF = new JTextField();
    private JTextField titleTF = new JTextField();
    private JTextField weightTF = new JTextField();
    private JTextField authorTF = new JTextField();
    private JTextField fileformatTF = new JTextField();
    private JLabel functionL = new JLabel();
    private JLabel booktypeL = new JLabel();
    private JLabel authorL = new JLabel();
    private JLabel quantityL = new JLabel();
    private JLabel shoptitle = new JLabel();
    private JLabel weightL = new JLabel();
    private JLabel titleL = new JLabel();
    private JLabel priceL = new JLabel();
    private JLabel fileformatL = new JLabel();
    private JButton ebookB = new JButton();
    private JButton physicalB = new JButton();
    private JButton convertB = new JButton();
    private JButton openbookB = new JButton();
    private JButton downloadbookB = new JButton();
    private JButton shippingcostB = new JButton();
    private JButton validateformatB = new JButton();
    private String booktype;

    private void initComponents() {
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        shoptitle.setText("Online Bookstore");
        getContentPane().add(shoptitle);
        shoptitle.setBounds(260, 20, 130, 16);

        titleL.setText("Title:");
        getContentPane().add(titleL);
        titleL.setBounds(30, 170, 70, 16);

        authorL.setText("Author:");
        getContentPane().add(authorL);
        authorL.setBounds(30, 200, 90, 16);

        priceL.setText("Price (RM):");
        getContentPane().add(priceL);
        priceL.setBounds(30, 230, 100, 16);

        quantityL.setText("Quantity：");
        getContentPane().add(quantityL);
        quantityL.setBounds(290, 230, 90, 16);

        titleTF.setEditable(false);
        getContentPane().add(titleTF);
        titleTF.setBounds(100, 170, 140, 22);

        authorTF.setEditable(false);
        getContentPane().add(authorTF);
        authorTF.setBounds(100, 200, 140, 22);

        priceTF.setEditable(false);
        getContentPane().add(priceTF);
        priceTF.setBounds(100, 230, 140, 20);

        quantityTF.setEditable(false);
        getContentPane().add(quantityTF);
        quantityTF.setBounds(370, 230, 140, 22);

        physicalB.setText("Physical Book");
        getContentPane().add(physicalB);
        physicalB.setBounds(50, 120, 130, 23);
        physicalB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {

                titleTF.setEditable(true);
                authorTF.setEditable(true);
                priceTF.setEditable(true);
                quantityTF.setEditable(true);
                weightTF.setEditable(true);
                weightTF.setEditable(true);
                fileformatTF.setEditable(false);

                openbookB.setEnabled(false);
                validateformatB.setEnabled(false);
                downloadbookB.setEnabled(false);
                shippingcostB.setEnabled(true);
                convertB.setEnabled(true);

                booktype = "physical book";
                fileformatTF.setText(" ");
            }
        });

        ebookB.setText("E-Book");
        getContentPane().add(ebookB);
        ebookB.setBounds(50, 80, 130, 23);
        ebookB.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
                titleTF.setEditable(true);
                authorTF.setEditable(true);
                priceTF.setEditable(true);
                quantityTF.setEditable(true);
                fileformatTF.setEditable(true);
                weightTF.setEditable(false);

                shippingcostB.setEnabled(false);
                convertB.setEnabled(false);
                openbookB.setEnabled(true);
                downloadbookB.setEnabled(true);
                validateformatB.setEnabled(true);

                weightTF.setText("0");
                fileformatTF.setText("");
                booktype = "ebook";

            }
        });
        fileformatL.setText("File Format:");
        getContentPane().add(fileformatL);
        fileformatL.setBounds(290, 170, 110, 16);
        fileformatTF.setEditable(false);
        getContentPane().add(fileformatTF);
        fileformatTF.setBounds(370, 170, 140, 22);

        weightL.setText("Weight (g)：");
        getContentPane().add(weightL);
        weightL.setBounds(290, 200, 110, 16);
        weightTF.setEditable(false);
        getContentPane().add(weightTF);
        weightTF.setBounds(370, 200, 140, 22);

        booktypeL.setText("Please select your book type first:");
        getContentPane().add(booktypeL);
        booktypeL.setBounds(20, 50, 230, 16);
        functionL.setText("Function:");
        getContentPane().add(functionL);
        functionL.setBounds(20, 350, 60, 16);

        openbookB.setText("Open Book");
        openbookB.setEnabled(false);
        openbookB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openbookBActionPerformed(evt);
            }
        });
        getContentPane().add(openbookB);
        openbookB.setBounds(10, 400, 200, 23);

        convertB.setText("Weight in Pounds");
        convertB.setEnabled(false);
        convertB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertBActionPerformed(evt);
            }
        });
        getContentPane().add(convertB);
        convertB.setBounds(230, 400, 200, 23);

        validateformatB.setText("Validate Format");
        validateformatB.setEnabled(false);
        validateformatB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validateformatBActionPerformed(evt);
            }
        });
        getContentPane().add(validateformatB);
        validateformatB.setBounds(10, 430, 200, 23);

        shippingcostB.setText("Calculate Shipping Cost");
        shippingcostB.setEnabled(false);
        shippingcostB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shippingcostBActionPerformed(evt);
            }
        });
        getContentPane().add(shippingcostB);
        shippingcostB.setBounds(230, 370, 200, 23);

        downloadbookB.setText("Download Book");
        downloadbookB.setEnabled(false);
        downloadbookB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downloadbookBActionPerformed(evt);
            }
        });
        getContentPane().add(downloadbookB);
        downloadbookB.setBounds(10, 370, 200, 23);
        pack();
    }

    private void downloadbookBActionPerformed(java.awt.event.ActionEvent evt) {
        EBook eBook1 = EBookinfo();
        eBook1.downloadBook();
    }

    private void openbookBActionPerformed(java.awt.event.ActionEvent evt) {
        EBook eBook1 = EBookinfo();
        eBook1.openBook();
    }

    private void validateformatBActionPerformed(java.awt.event.ActionEvent evt) {
        EBook eBook1 = EBookinfo();
        eBook1.validateFormat();
        JOptionPane.showMessageDialog(null, eBook1.validateFormat(), "Action",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void convertBActionPerformed(java.awt.event.ActionEvent evt) {
        PhysicalBook physicalbook1 = physicalBookinfo();
        physicalbook1.getWeightInPounds();
        JOptionPane.showMessageDialog(null, "Pounds (lb): " + physicalbook1.getWeightInPounds(), "Action",
                JOptionPane.INFORMATION_MESSAGE);
    }

    private void shippingcostBActionPerformed(java.awt.event.ActionEvent evt) {
        PhysicalBook physicalbook1 = physicalBookinfo();
        physicalbook1.calculateShippingCost();
        JOptionPane.showMessageDialog(null, "Shipping Cost (RM): "+physicalbook1.calculateShippingCost(), "Action",
                JOptionPane.INFORMATION_MESSAGE);
    }

    // get text from textfield
    EBook EBookinfo() {
        String author = authorTF.getText();
        String title = titleTF.getText();
        double price = Double.parseDouble(priceTF.getText());
        int quantity = Integer.parseInt(quantityTF.getText());
        String fileformat = fileformatTF.getText();
        return new EBook(title, author, price, quantity, fileformat);
    }

    PhysicalBook physicalBookinfo() {
        String author = authorTF.getText();
        String title = titleTF.getText();
        double price = Double.parseDouble(priceTF.getText());
        int quantity = Integer.parseInt(quantityTF.getText());
        int weight = Integer.parseInt(weightTF.getText());
        return new PhysicalBook(title, author, price, quantity, weight);
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame screen = new OnlineBookstore();
                screen.setVisible(true);
                screen.setSize(700, 600);
                screen.setTitle("Assignment 1");
            }
        });
    }
}