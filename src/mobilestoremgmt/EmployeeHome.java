/*
        ________Done_________
>>sell stock (Alpha testing done)
>>update accessory info
>>update stock
>>change pass
>>add mobile
>>update mobile
>>update accessory info

*/

/*
Mission Report
>>add new mobile info complete
>>update stock complete  
>>update mobile info complete
>>add accessory info
       >>corrected.....not able to redirect properly to update stocksD page
>>done update accessory info
    >>reset function 
    >>update function
    >>delete function
>>working on recommend a phone
    >>recommend by rating 
	>>smart recommend
>>redirect to sell stock done
>>parallel working on sell stock reset
    >>correct ss date fill
 >>done add to cart
>>done Buy Now Button
*/
/*
Test:
delete button in update mobile info
change password

*/
/*
Tasks:
        ---->>Optimise the program by using the table named stockindex<<----
        -->>Validation of every text field
clear smart recommend after redirecting


*/
package mobilestoremgmt;
import java.text.SimpleDateFormat;  
import java.util.Date; 
import DB.DBConnection;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.sql.SQLException;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class EmployeeHome extends javax.swing.JFrame 
{
    String curruser=LoginPage.cuser;
    boolean redirect_from_ami=false;
    boolean redirect_from_aai=false;
    
    BufferedImage img;
    public EmployeeHome() 
    {
        initComponents();
        initiate();
        try {
            //img = ImageIO.read(new URL("https://pin.it/7026r7V"));
            img=ImageIO.read(getClass().getResource("/img/754650.jpg"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField64 = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        jDesktopPane1 = new javax.swing.JDesktopPane(){
            @Override
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);
                grphcs.drawImage(img, 0, 0, null);
            }
        };
        AddMobInfo = new javax.swing.JInternalFrame();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jSlider1 = new javax.swing.JSlider();
        jSlider2 = new javax.swing.JSlider();
        jSlider3 = new javax.swing.JSlider();
        jSlider4 = new javax.swing.JSlider();
        jSlider5 = new javax.swing.JSlider();
        jSlider6 = new javax.swing.JSlider();
        jSlider7 = new javax.swing.JSlider();
        jButton1 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel132 = new javax.swing.JLabel();
        UpdateMobInfo = new javax.swing.JInternalFrame();
        jTextField41 = new javax.swing.JTextField();
        jTextField42 = new javax.swing.JTextField();
        jTextField43 = new javax.swing.JTextField();
        jTextField44 = new javax.swing.JTextField();
        jTextField45 = new javax.swing.JTextField();
        jTextField46 = new javax.swing.JTextField();
        jTextField47 = new javax.swing.JTextField();
        jTextField48 = new javax.swing.JTextField();
        jSlider8 = new javax.swing.JSlider();
        jSlider9 = new javax.swing.JSlider();
        jSlider10 = new javax.swing.JSlider();
        jLabel86 = new javax.swing.JLabel();
        jSlider11 = new javax.swing.JSlider();
        jLabel87 = new javax.swing.JLabel();
        jSlider12 = new javax.swing.JSlider();
        jLabel88 = new javax.swing.JLabel();
        jSlider13 = new javax.swing.JSlider();
        jLabel89 = new javax.swing.JLabel();
        jSlider14 = new javax.swing.JSlider();
        jLabel90 = new javax.swing.JLabel();
        jButton11 = new javax.swing.JButton();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jTextField50 = new javax.swing.JTextField();
        jTextField51 = new javax.swing.JTextField();
        jTextField53 = new javax.swing.JTextField();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jButton12 = new javax.swing.JButton();
        jLabel113 = new javax.swing.JLabel();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel114 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        SearchMob = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jTextField29 = new javax.swing.JTextField();
        jTextField30 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel59 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jButton18 = new javax.swing.JButton();
        jLabel85 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jSpinner4 = new javax.swing.JSpinner();
        jLabel34 = new javax.swing.JLabel();
        jSpinner5 = new javax.swing.JSpinner();
        jLabel35 = new javax.swing.JLabel();
        jSpinner6 = new javax.swing.JSpinner();
        jLabel36 = new javax.swing.JLabel();
        jSpinner7 = new javax.swing.JSpinner();
        jLabel37 = new javax.swing.JLabel();
        jTextField27 = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jTextField28 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel31 = new javax.swing.JLabel();
        jSpinner2 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();
        jLabel32 = new javax.swing.JLabel();
        jSpinner3 = new javax.swing.JSpinner();
        jLabel38 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel39 = new javax.swing.JLabel();
        jButton16 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jTextField18 = new javax.swing.JTextField();
        jTextField19 = new javax.swing.JTextField();
        jTextField20 = new javax.swing.JTextField();
        jTextField21 = new javax.swing.JTextField();
        jTextField22 = new javax.swing.JTextField();
        jTextField23 = new javax.swing.JTextField();
        jTextField24 = new javax.swing.JTextField();
        jTextField25 = new javax.swing.JTextField();
        jTextField26 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton17 = new javax.swing.JButton();
        SellStock = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jTextField33 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel70 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox10 = new javax.swing.JComboBox();
        jComboBox13 = new javax.swing.JComboBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        jButton28 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        jLabel74 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList4 = new javax.swing.JList();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel73 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jButton27 = new javax.swing.JButton();
        UpdateStock = new javax.swing.JInternalFrame();
        jLabel97 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jButton15 = new javax.swing.JButton();
        jComboBox7 = new javax.swing.JComboBox();
        jComboBox8 = new javax.swing.JComboBox();
        jTextField49 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jLabel120 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jTextField60 = new javax.swing.JTextField();
        jButton23 = new javax.swing.JButton();
        ChangePass = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jTextField32 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jPasswordField3 = new javax.swing.JPasswordField();
        AddAccInfo = new javax.swing.JInternalFrame();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jComboBox9 = new javax.swing.JComboBox();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        UpdateAccInfo = new javax.swing.JInternalFrame();
        jLabel125 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jButton24 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jComboBox11 = new javax.swing.JComboBox();
        jTextField66 = new javax.swing.JTextField();
        jComboBox12 = new javax.swing.JComboBox();
        jButton25 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jTextField64.setText("jTextField64");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Smart Cell Retail Software");

        jToolBar1.setRollover(true);

        jDesktopPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        AddMobInfo.setClosable(true);
        AddMobInfo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        AddMobInfo.setMaximizable(true);
        AddMobInfo.setResizable(true);
        AddMobInfo.setTitle("Add New Mobile");
        AddMobInfo.setVisible(true);
        AddMobInfo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel2.setText("Add New Mobile Info");
        AddMobInfo.getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, -1, -1));

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel1.setText("Company");
        AddMobInfo.getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel3.setText("Item Id");
        AddMobInfo.getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel4.setText("Model");
        AddMobInfo.getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel5.setText("Ram Size");
        AddMobInfo.getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel7.setText("Screen Size");
        AddMobInfo.getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel8.setText("Screen Type");
        AddMobInfo.getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel9.setText("Screen Resolution");
        AddMobInfo.getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel10.setText("Screen PPI");
        AddMobInfo.getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel11.setText("Secondary Camera");
        AddMobInfo.getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel12.setText("Primary Camera");
        AddMobInfo.getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, -1, -1));

        jLabel13.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel13.setText("Battery Capacity");
        AddMobInfo.getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        jLabel14.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel14.setText("Clock Speed");
        AddMobInfo.getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 630, -1, -1));

        jLabel15.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel15.setText("Processor Name");
        AddMobInfo.getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 580, -1, -1));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel16.setText("Cores Count");
        AddMobInfo.getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 660, -1, -1));

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel17.setText("Overall");
        AddMobInfo.getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, -1, -1));

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel18.setText("Duarability");
        AddMobInfo.getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, -1, -1));

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel20.setText("Additional Info");
        AddMobInfo.getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 520, -1, -1));

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel21.setText("Secondry Memory");
        AddMobInfo.getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(615, 113, -1, -1));

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel22.setText("Colour Options");
        AddMobInfo.getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 160, -1, -1));

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel23.setText("Camera");
        AddMobInfo.getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, -1, -1));

        jLabel24.setFont(new java.awt.Font("Calibri", 1, 17)); // NOI18N
        jLabel24.setText("Ratings");
        AddMobInfo.getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 220, -1, -1));

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel25.setText("Battery");
        AddMobInfo.getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 300, -1, -1));

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel26.setText("Value of money");
        AddMobInfo.getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 370, -1, -1));

        jLabel28.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel28.setText("Performance");
        AddMobInfo.getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 340, -1, -1));

        jLabel30.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel30.setText("Screen");
        AddMobInfo.getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 410, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        AddMobInfo.getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 520, 422, 154));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 235, -1));

        jTextField2.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 235, -1));

        jTextField3.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 235, -1));

        jTextField5.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 235, -1));

        jTextField6.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, 235, -1));

        jTextField7.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 235, -1));

        jTextField8.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 235, -1));

        jTextField9.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 235, -1));

        jTextField10.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, 235, -1));

        jTextField11.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 500, 235, -1));

        jTextField12.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 540, 235, -1));

        jTextField13.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 580, 235, -1));

        jTextField14.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField14, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, 235, -1));

        jTextField15.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField15, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 660, 235, -1));

        jTextField16.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField16, new org.netbeans.lib.awtextra.AbsoluteConstraints(793, 110, 235, -1));

        jTextField17.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField17, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 235, -1));

        jSlider1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jSlider1.setMaximum(10);
        jSlider1.setMinimum(1);
        AddMobInfo.getContentPane().add(jSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, -1, -1));

        jSlider2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jSlider2.setMaximum(10);
        jSlider2.setMinimum(1);
        AddMobInfo.getContentPane().add(jSlider2, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        jSlider3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jSlider3.setMaximum(10);
        jSlider3.setMinimum(1);
        AddMobInfo.getContentPane().add(jSlider3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, -1, 30));

        jSlider4.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jSlider4.setMaximum(10);
        jSlider4.setMinimum(1);
        AddMobInfo.getContentPane().add(jSlider4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 370, -1, -1));

        jSlider5.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jSlider5.setMaximum(10);
        jSlider5.setMinimum(1);
        AddMobInfo.getContentPane().add(jSlider5, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, -1, -1));

        jSlider6.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jSlider6.setMaximum(10);
        jSlider6.setMinimum(1);
        AddMobInfo.getContentPane().add(jSlider6, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, -1, -1));

        jSlider7.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jSlider7.setMaximum(10);
        jSlider7.setMinimum(1);
        AddMobInfo.getContentPane().add(jSlider7, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, -1, -1));

        jButton1.setText("Add Device");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        AddMobInfo.getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 710, 120, 40));

        jButton13.setText("Cancel");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        AddMobInfo.getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 710, 120, 40));

        jButton14.setText("Add stock info");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        AddMobInfo.getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 710, 120, 40));

        jTextField4.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        AddMobInfo.getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 235, -1));

        jLabel132.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel132.setText("Name");
        AddMobInfo.getContentPane().add(jLabel132, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jDesktopPane1.add(AddMobInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 1200, 800));

        UpdateMobInfo.setClosable(true);
        UpdateMobInfo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        UpdateMobInfo.setMaximizable(true);
        UpdateMobInfo.setResizable(true);
        UpdateMobInfo.setTitle("Update Mobile Info");
        UpdateMobInfo.setVisible(true);
        UpdateMobInfo.getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField41.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField41, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 235, -1));

        jTextField42.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField42, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 235, -1));

        jTextField43.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField43, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 550, 235, -1));

        jTextField44.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField44, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 590, 235, -1));

        jTextField45.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField45, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 630, 235, -1));

        jTextField46.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField46, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 680, 235, -1));

        jTextField47.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField47, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 150, 235, -1));

        jTextField48.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField48, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 190, 235, -1));

        jSlider8.setMaximum(10);
        jSlider8.setMinimum(1);
        UpdateMobInfo.getContentPane().add(jSlider8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, -1, -1));

        jSlider9.setMaximum(10);
        jSlider9.setMinimum(1);
        UpdateMobInfo.getContentPane().add(jSlider9, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 300, -1, -1));

        jSlider10.setMaximum(10);
        jSlider10.setMinimum(1);
        UpdateMobInfo.getContentPane().add(jSlider10, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, -1, -1));

        jLabel86.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel86.setText("Screen Size");
        UpdateMobInfo.getContentPane().add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jSlider11.setMaximum(10);
        jSlider11.setMinimum(1);
        UpdateMobInfo.getContentPane().add(jSlider11, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 360, -1, -1));

        jLabel87.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel87.setText("Screen Type");
        UpdateMobInfo.getContentPane().add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        jSlider12.setMaximum(10);
        jSlider12.setMinimum(1);
        UpdateMobInfo.getContentPane().add(jSlider12, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 400, -1, -1));

        jLabel88.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel88.setText("Screen Resolution");
        UpdateMobInfo.getContentPane().add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, -1, -1));

        jSlider13.setMaximum(10);
        jSlider13.setMinimum(1);
        UpdateMobInfo.getContentPane().add(jSlider13, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 440, -1, -1));

        jLabel89.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel89.setText("Screen PPI");
        UpdateMobInfo.getContentPane().add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, -1, -1));

        jSlider14.setMaximum(10);
        jSlider14.setMinimum(1);
        UpdateMobInfo.getContentPane().add(jSlider14, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 480, -1, -1));

        jLabel90.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel90.setText("Secondary Camera");
        UpdateMobInfo.getContentPane().add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 510, -1, -1));

        jButton11.setText("Update");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        UpdateMobInfo.getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 610, 80, 40));

        jLabel91.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel91.setText("Primary Camera");
        UpdateMobInfo.getContentPane().add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 470, -1, -1));

        jLabel92.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel92.setText("Battery Capacity");
        UpdateMobInfo.getContentPane().add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 550, -1, -1));

        jLabel93.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel93.setText("Clock Speed");
        UpdateMobInfo.getContentPane().add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 630, -1, -1));

        jLabel94.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel94.setText("Processor Name");
        UpdateMobInfo.getContentPane().add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 590, -1, -1));

        jLabel95.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel95.setText("Update Mobile Info");
        UpdateMobInfo.getContentPane().add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 13, -1, -1));

        jLabel96.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel96.setText("Company");
        UpdateMobInfo.getContentPane().add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 162, -1, -1));

        jLabel98.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel98.setText("Model");
        UpdateMobInfo.getContentPane().add(jLabel98, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 205, -1, -1));

        jLabel99.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel99.setText("Ram Size");
        UpdateMobInfo.getContentPane().add(jLabel99, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, -1, -1));

        jLabel100.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel100.setText("Cores Count");
        UpdateMobInfo.getContentPane().add(jLabel100, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, -1, -1));

        jLabel101.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel101.setText("Overall");
        UpdateMobInfo.getContentPane().add(jLabel101, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 490, -1, -1));

        jLabel102.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel102.setText("Duarability");
        UpdateMobInfo.getContentPane().add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 450, -1, -1));

        jLabel104.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel104.setText("Additional Info");
        UpdateMobInfo.getContentPane().add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 530, -1, -1));

        jLabel105.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel105.setText("Secondry Memory");
        UpdateMobInfo.getContentPane().add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, -1));

        jLabel106.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel106.setText("Colour Options");
        UpdateMobInfo.getContentPane().add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        jLabel107.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel107.setText("Camera");
        UpdateMobInfo.getContentPane().add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 260, -1, -1));

        jLabel108.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel108.setText("Ratings");
        UpdateMobInfo.getContentPane().add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 230, -1, -1));

        jLabel109.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel109.setText("Battery");
        UpdateMobInfo.getContentPane().add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 300, -1, -1));

        jLabel110.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel110.setText("Value of money");
        UpdateMobInfo.getContentPane().add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 370, -1, -1));

        jLabel111.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel111.setText("Performance");
        UpdateMobInfo.getContentPane().add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, -1, -1));

        jLabel112.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel112.setText("Screen");
        UpdateMobInfo.getContentPane().add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 410, -1, -1));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane4.setViewportView(jTextArea2);

        UpdateMobInfo.getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 520, 422, 154));

        jTextField50.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField50, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 159, 235, -1));

        jTextField51.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField51, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 202, 235, -1));

        jTextField53.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField53, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, 235, -1));

        jTextField54.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField54, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 235, -1));

        jTextField55.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField55, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 235, -1));

        jTextField56.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField56, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 370, 235, -1));

        jTextField57.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        UpdateMobInfo.getContentPane().add(jTextField57, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 235, -1));

        jButton12.setText("Delete");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        UpdateMobInfo.getContentPane().add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(1200, 560, 80, 40));

        jLabel113.setText("Item id");
        UpdateMobInfo.getContentPane().add(jLabel113, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 102, -1, -1));

        jComboBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox5ActionPerformed(evt);
            }
        });
        UpdateMobInfo.getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 99, 299, -1));

        UpdateMobInfo.getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(797, 99, 299, -1));

        jLabel114.setText("Device Name");
        UpdateMobInfo.getContentPane().add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(684, 102, -1, -1));
        UpdateMobInfo.getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 128, 1004, 10));

        jDesktopPane1.add(UpdateMobInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 1430, 830));

        SearchMob.setClosable(true);
        SearchMob.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        SearchMob.setMaximizable(true);
        SearchMob.setResizable(true);
        SearchMob.setTitle("Search Mobile");
        SearchMob.setVisible(true);

        jLabel51.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel51.setText("Smart Recommend");

        jLabel52.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel52.setText("Budget");

        jLabel53.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel53.setText("Camera");

        jLabel54.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel54.setText("Performance");

        jLabel55.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel55.setText("Battery");

        jLabel56.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel56.setText("Value of Money");

        jLabel57.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel57.setText("Screen");

        jCheckBox1.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jCheckBox2.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jCheckBox3.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jCheckBox4.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jCheckBox5.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField29.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField30.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jLabel58.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel58.setText("to");

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel59.setText("After entering the budget, check mark the features you are looking your device to satisfy.");

        jList3.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jScrollPane6.setViewportView(jList3);

        jButton18.setText("Add to Cart");
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });

        jLabel85.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel85.setText("Durability");

        jLabel103.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel103.setText("Overall");

        jCheckBox6.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jCheckBox9.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(jLabel51))
                    .addComponent(jLabel59))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel53)
                    .addComponent(jLabel54)
                    .addComponent(jLabel56)
                    .addComponent(jLabel57)
                    .addComponent(jLabel52)
                    .addComponent(jLabel55)
                    .addComponent(jLabel85)
                    .addComponent(jLabel103))
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox4)
                            .addComponent(jCheckBox3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBox5)
                            .addComponent(jCheckBox2)
                            .addComponent(jCheckBox1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel58)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jCheckBox6)
                            .addComponent(jCheckBox9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton18, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jCheckBox9)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel51)
                                .addGap(130, 130, 130)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel52)
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jTextField29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel58)))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                            .addComponent(jLabel53)
                                                                            .addComponent(jCheckBox1))
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addComponent(jCheckBox2))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel54))
                                                            .addComponent(jCheckBox3))
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel56))
                                                    .addComponent(jCheckBox4)
                                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel57))
                                            .addComponent(jCheckBox5, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel85))
                                    .addComponent(jCheckBox6))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel103)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel59))
        );

        jTabbedPane1.addTab("Smart Recommend", jPanel3);

        jLabel33.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel33.setText("Value of Money  *");

        jSpinner4.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel34.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel34.setText("Screen *");

        jSpinner5.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel35.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel35.setText("Durability *");

        jSpinner6.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel36.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel36.setText("Overall *");

        jSpinner7.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel37.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel37.setText("Budget");

        jTextField27.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jTextField27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField27ActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel27.setText("Search by Rating");

        jTextField28.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jTextField28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField28ActionPerformed(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel29.setText("Camera *");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel31.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel31.setText("Battery *");

        jSpinner2.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jButton2.setText("Add to Cart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel32.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel32.setText("Performance *");

        jSpinner3.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        jLabel38.setText("to");

        jList1.setBackground(new java.awt.Color(240, 240, 240));
        jList1.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jScrollPane3.setViewportView(jList1);

        jLabel39.setText("* All the ratings are ranging from 1 to 5. Greater the number more the quality.");

        jButton16.setText("Search");
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addGap(110, 110, 110)
                        .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel31))
                        .addGap(111, 111, 111)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel33)
                            .addComponent(jLabel34)
                            .addComponent(jLabel35)
                            .addComponent(jLabel36)
                            .addComponent(jLabel32))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 334, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(423, 423, 423)
                        .addComponent(jLabel27))
                    .addComponent(jLabel39))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(613, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(480, 480, 480)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel37)
                            .addComponent(jTextField27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel29)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel31)
                            .addComponent(jSpinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32)
                            .addComponent(jSpinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel33)
                            .addComponent(jSpinner4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34)
                            .addComponent(jSpinner5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel35)
                            .addComponent(jSpinner6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36)
                            .addComponent(jSpinner7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(369, Short.MAX_VALUE)
                    .addComponent(jButton16, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(274, 274, 274)))
        );

        jTabbedPane1.addTab("Search by Rating", jPanel1);

        jLabel40.setText("* Multiple values supported. Seperate by commas.");

        jLabel41.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel41.setText("Search by Specification");

        jLabel42.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel42.setText("Company *");

        jLabel43.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel43.setText("Processor *");

        jLabel44.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel44.setText("Primary Camera *");

        jLabel45.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel45.setText("Secondary Camera *");

        jLabel46.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel46.setText("Minimum Ram Size");

        jLabel47.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel47.setText("Screen Type *");

        jLabel48.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel48.setText("Minimum Battery Capacity");

        jLabel49.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel49.setText("Budget");

        jTextField18.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField19.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField20.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField21.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField22.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField23.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField24.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField25.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField26.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jLabel50.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel50.setText("to");

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jList2.setBackground(new java.awt.Color(240, 240, 240));
        jList2.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jScrollPane5.setViewportView(jList2);

        jButton17.setText("Add to Cart");
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel40)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(425, 425, 425)
                .addComponent(jLabel41)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)
                            .addComponent(jLabel45)
                            .addComponent(jLabel46)
                            .addComponent(jLabel47)
                            .addComponent(jLabel48)
                            .addComponent(jLabel49))
                        .addGap(72, 72, 72)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addComponent(jLabel50)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(180, 180, 180))))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField18, jTextField19, jTextField20, jTextField21, jTextField22, jTextField23, jTextField24});

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextField25, jTextField26});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel41)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel42)
                            .addComponent(jTextField18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel43)
                            .addComponent(jTextField19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel44)
                            .addComponent(jTextField20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel45)
                            .addComponent(jTextField21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel46)
                            .addComponent(jTextField22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel47)
                            .addComponent(jTextField23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(jTextField24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(jTextField25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50))
                        .addGap(66, 66, 66)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(jLabel40))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Search by specs", jPanel2);

        javax.swing.GroupLayout SearchMobLayout = new javax.swing.GroupLayout(SearchMob.getContentPane());
        SearchMob.getContentPane().setLayout(SearchMobLayout);
        SearchMobLayout.setHorizontalGroup(
            SearchMobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        SearchMobLayout.setVerticalGroup(
            SearchMobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDesktopPane1.add(SearchMob, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        SellStock.setClosable(true);
        SellStock.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        SellStock.setMaximizable(true);
        SellStock.setResizable(true);
        SellStock.setTitle("Sell Stock");
        SellStock.setVisible(true);

        jLabel60.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel60.setText("Sell Stock");

        jLabel61.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel61.setText("Device Full Name");

        jLabel62.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel62.setText("IMEI Number");

        jLabel64.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel64.setText("Customer id");

        jLabel65.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel65.setText("Name");

        jLabel66.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel66.setText("Phone");

        jLabel67.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel67.setText("Email");

        jLabel68.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel68.setText("DOB");

        jLabel69.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel69.setText("Address");

        jLabel71.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel71.setText("Item Id");

        jTextField33.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField35.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField36.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField37.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });

        jTextField38.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel70.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel70.setText("Bill id : ");

        jLabel72.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel72.setText("B0000");

        jButton5.setText("Add to Cart");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });

        jComboBox10.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox10ActionPerformed(evt);
            }
        });

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox13ActionPerformed(evt);
            }
        });

        jToggleButton1.setText("New Customer");
        jToggleButton1.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jToggleButton1StateChanged(evt);
            }
        });
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jButton28.setText("Add Customer");
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel70)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel72))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(87, 87, 87)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(23, 23, 23)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel65)
                                            .addComponent(jLabel66)
                                            .addComponent(jLabel67)
                                            .addComponent(jLabel69)
                                            .addComponent(jLabel68))
                                        .addGap(131, 131, 131)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextField38, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField37, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField36, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addComponent(jLabel64)
                                        .addGap(96, 96, 96)
                                        .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(103, 103, 103)
                                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel62)
                                            .addComponent(jLabel61)
                                            .addComponent(jLabel71))
                                        .addGap(70, 70, 70)
                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField33)
                                            .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jComboBox10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(57, 57, 57)
                                        .addComponent(jButton5))))))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 799, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jButton28, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel60)
                .addGap(27, 27, 27))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel60)
                .addGap(36, 36, 36)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel70)
                    .addComponent(jLabel72))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel71)
                            .addComponent(jComboBox10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel62)
                            .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jToggleButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel64)
                    .addComponent(jComboBox13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel65)
                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel66)
                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel67)
                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel68)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel69)
                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton28)
                .addGap(25, 25, 25))
        );

        jLabel74.setFont(new java.awt.Font("Calibri", 0, 17)); // NOI18N
        jLabel74.setText("Cart");

        jList4.setBackground(new java.awt.Color(245, 245, 245));
        jList4.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jList4.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList4ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList4);

        jButton6.setText("Buy Now");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton8.setText("Cancel");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jLabel73.setText("Total Items:");

        jLabel75.setText("jLabel75");

        jLabel76.setText("Grand Total:");

        jLabel77.setText("jLabel77");

        jButton27.setText("Delete");
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 102, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel76)
                                            .addComponent(jLabel73))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel75)
                                            .addComponent(jLabel77)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabel74)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel74)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton27, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel73)
                    .addComponent(jLabel75))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel76)
                    .addComponent(jLabel77))
                .addGap(36, 36, 36)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout SellStockLayout = new javax.swing.GroupLayout(SellStock.getContentPane());
        SellStock.getContentPane().setLayout(SellStockLayout);
        SellStockLayout.setHorizontalGroup(
            SellStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SellStockLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SellStockLayout.setVerticalGroup(
            SellStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jDesktopPane1.add(SellStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 1460, 750));

        UpdateStock.setClosable(true);
        UpdateStock.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        UpdateStock.setMaximizable(true);
        UpdateStock.setResizable(true);
        UpdateStock.setVisible(true);

        jLabel97.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel97.setText("Update Stock");

        jLabel115.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel115.setText("Item Id");

        jLabel116.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel116.setText("Device Name");

        jLabel117.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel117.setText("Remaining Stock");

        jLabel118.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel118.setText("Update Stock *");

        jLabel119.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel119.setText("Bill Id");

        jButton15.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jButton15.setText("Update");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });

        jComboBox7.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jComboBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox7ActionPerformed(evt);
            }
        });

        jComboBox8.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jComboBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox8ActionPerformed(evt);
            }
        });

        jTextField49.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField58.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField59.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jLabel120.setText("* use + or - sign to Add or Remove Stock Quantity");

        jLabel127.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel127.setText("Price");

        jTextField60.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jButton23.setText("Clear");
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpdateStockLayout = new javax.swing.GroupLayout(UpdateStock.getContentPane());
        UpdateStock.getContentPane().setLayout(UpdateStockLayout);
        UpdateStockLayout.setHorizontalGroup(
            UpdateStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateStockLayout.createSequentialGroup()
                .addGroup(UpdateStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdateStockLayout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(jLabel97))
                    .addComponent(jLabel120)
                    .addGroup(UpdateStockLayout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(UpdateStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(UpdateStockLayout.createSequentialGroup()
                                .addComponent(jLabel127)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(UpdateStockLayout.createSequentialGroup()
                                .addGroup(UpdateStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel115)
                                    .addComponent(jLabel116)
                                    .addComponent(jLabel117)
                                    .addComponent(jLabel118)
                                    .addComponent(jLabel119))
                                .addGap(92, 92, 92)
                                .addGroup(UpdateStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(UpdateStockLayout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton23)))
                .addContainerGap(118, Short.MAX_VALUE))
        );

        UpdateStockLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jComboBox7, jComboBox8, jTextField49, jTextField58, jTextField59});

        UpdateStockLayout.setVerticalGroup(
            UpdateStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateStockLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel97)
                .addGap(40, 40, 40)
                .addGroup(UpdateStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel115)
                    .addComponent(jComboBox7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UpdateStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel116)
                    .addComponent(jComboBox8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UpdateStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel117)
                    .addComponent(jTextField49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UpdateStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel118)
                    .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UpdateStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel119)
                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(UpdateStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel127)
                    .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(UpdateStockLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton15, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton23))
                .addGap(31, 31, 31)
                .addComponent(jLabel120))
        );

        jDesktopPane1.add(UpdateStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 680, 530));

        ChangePass.setClosable(true);
        ChangePass.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        ChangePass.setMaximizable(true);
        ChangePass.setResizable(true);
        ChangePass.setTitle("Change Password");
        ChangePass.setVisible(true);

        jLabel78.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel78.setText("Change Password");

        jLabel79.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel79.setText("Username ");

        jLabel80.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel80.setText("Old Password");

        jButton9.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jButton9.setText("Confirm");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jLabel81.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel81.setText("New Password");

        jLabel82.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel82.setText("Confirm Password");

        jButton10.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jButton10.setText("Submit");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        jTextField32.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jTextField32.setText("jTextField32");
        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });

        jPasswordField1.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jPasswordField1.setText("jPasswordField1");

        jPasswordField2.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jPasswordField2.setText("jPasswordField1");

        jPasswordField3.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jPasswordField3.setText("jPasswordField1");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(326, 326, 326)
                        .addComponent(jLabel78))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel80)
                                    .addComponent(jLabel79))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField32)
                                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(84, 84, 84)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel82)
                                    .addComponent(jLabel81, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jPasswordField3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                                    .addComponent(jPasswordField2)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(193, 193, 193)
                                .addComponent(jButton9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138)))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel78)
                .addGap(66, 66, 66)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jPasswordField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel81))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel82)
                            .addComponent(jPasswordField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel79)
                            .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel80)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout ChangePassLayout = new javax.swing.GroupLayout(ChangePass.getContentPane());
        ChangePass.getContentPane().setLayout(ChangePassLayout);
        ChangePassLayout.setHorizontalGroup(
            ChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        ChangePassLayout.setVerticalGroup(
            ChangePassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jDesktopPane1.add(ChangePass, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 1030, 590));

        AddAccInfo.setClosable(true);
        AddAccInfo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        AddAccInfo.setTitle("Add New Accessory Info");
        AddAccInfo.setVisible(true);

        jLabel121.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel121.setText("Add New Accessory Info");

        jLabel122.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel122.setText("Item Id");

        jLabel123.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel123.setText("Name");

        jLabel124.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel124.setText("Type");

        jLabel126.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel126.setText("Description");

        jTextField61.setEditable(false);
        jTextField61.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextField62.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jScrollPane7.setViewportView(jTextArea3);

        jComboBox9.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton19.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jButton19.setText("Add New");
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });

        jButton20.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jButton20.setText("Add");
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });

        jButton21.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jButton21.setText("Add Stock Details");
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });

        jButton22.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jButton22.setText("Cancel");
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout AddAccInfoLayout = new javax.swing.GroupLayout(AddAccInfo.getContentPane());
        AddAccInfo.getContentPane().setLayout(AddAccInfoLayout);
        AddAccInfoLayout.setHorizontalGroup(
            AddAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AddAccInfoLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(AddAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AddAccInfoLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(AddAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(AddAccInfoLayout.createSequentialGroup()
                                .addGroup(AddAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel122)
                                    .addComponent(jLabel123)
                                    .addComponent(jLabel126)
                                    .addComponent(jLabel124))
                                .addGap(110, 110, 110)
                                .addGroup(AddAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField62)
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                    .addGroup(AddAccInfoLayout.createSequentialGroup()
                                        .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton19, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel121)))
                    .addGroup(AddAccInfoLayout.createSequentialGroup()
                        .addComponent(jButton20)
                        .addGap(77, 77, 77)
                        .addComponent(jButton21)
                        .addGap(80, 80, 80)
                        .addComponent(jButton22)))
                .addGap(61, 61, 61))
        );

        AddAccInfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane7, jTextField61, jTextField62});

        AddAccInfoLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton20, jButton21, jButton22});

        AddAccInfoLayout.setVerticalGroup(
            AddAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AddAccInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel121)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addGroup(AddAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel122)
                    .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel123)
                    .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AddAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel124)
                    .addComponent(jComboBox9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton19))
                .addGap(18, 18, 18)
                .addGroup(AddAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel126)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(AddAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton20)
                    .addComponent(jButton21)
                    .addComponent(jButton22))
                .addGap(52, 52, 52))
        );

        jDesktopPane1.add(AddAccInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 740, 610));

        UpdateAccInfo.setClosable(true);
        UpdateAccInfo.setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        UpdateAccInfo.setTitle("Update Accessory Info");
        UpdateAccInfo.setVisible(true);

        jLabel125.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel125.setText("Update Accessory Info");

        jLabel128.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel128.setText("Item Id");

        jLabel129.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel129.setText("Name");

        jLabel130.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel130.setText("Type");

        jLabel131.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jLabel131.setText("Description");

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jScrollPane8.setViewportView(jTextArea4);

        jButton24.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jButton24.setText("Update");
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });

        jButton26.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jButton26.setText("Cancel");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jComboBox11.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jComboBox11.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox11ActionPerformed(evt);
            }
        });

        jTextField66.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jTextField66.setText("jTextField66");
        jTextField66.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField66ActionPerformed(evt);
            }
        });

        jComboBox12.setFont(new java.awt.Font("Calibri", 0, 15)); // NOI18N
        jComboBox12.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox12ActionPerformed(evt);
            }
        });

        jButton25.setText("Delete");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton7.setText("Change Name");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout UpdateAccInfoLayout = new javax.swing.GroupLayout(UpdateAccInfo.getContentPane());
        UpdateAccInfo.getContentPane().setLayout(UpdateAccInfoLayout);
        UpdateAccInfoLayout.setHorizontalGroup(
            UpdateAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateAccInfoLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addGroup(UpdateAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(UpdateAccInfoLayout.createSequentialGroup()
                        .addGroup(UpdateAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel128)
                            .addComponent(jLabel129)
                            .addComponent(jLabel131)
                            .addComponent(jLabel130))
                        .addGap(110, 110, 110)
                        .addGroup(UpdateAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jComboBox11, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField66)
                            .addComponent(jComboBox12, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton7))
                    .addGroup(UpdateAccInfoLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel125))
                    .addGroup(UpdateAccInfoLayout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton24)
                        .addGap(44, 44, 44)
                        .addComponent(jButton25)
                        .addGap(43, 43, 43)
                        .addComponent(jButton26)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        UpdateAccInfoLayout.setVerticalGroup(
            UpdateAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(UpdateAccInfoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel125)
                .addGap(64, 64, 64)
                .addGroup(UpdateAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel128)
                    .addComponent(jComboBox12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UpdateAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel129)
                    .addComponent(jComboBox11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7))
                .addGap(18, 18, 18)
                .addGroup(UpdateAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel130)
                    .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(UpdateAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel131)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(UpdateAccInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton24)
                    .addComponent(jButton26)
                    .addComponent(jButton25))
                .addContainerGap(85, Short.MAX_VALUE))
        );

        jDesktopPane1.add(UpdateAccInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 740, 610));

        jMenu2.setText("File");

        jMenuItem9.setText("Sell Items");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setText("Close All Windows");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem10);

        jMenuItem12.setText("Exit");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Stock");

        jMenuItem4.setText("Add New Mobile Info");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuItem5.setText("Add New Accessory Info");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Update Stock Info");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setText("Update Mobile Info");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuItem8.setText("Update Accessory Info");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem8);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Recommend me a Phone");

        jMenuItem11.setText("Smart Recommend");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuItem13.setText("By Rating");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem13);

        jMenuItem14.setText("By Specs");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem14);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Appearance");

        jMenuItem3.setText("Themes");
        jMenu5.add(jMenuItem3);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Account");

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem1);

        jMenuItem2.setText("Change Password");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem2);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jDesktopPane1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField28ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField28ActionPerformed

    private void jTextField27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField27ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField27ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ami_enterdb();
        ami_reset();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        umi_update();
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        umi_delete();
        umi_reset();
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        ami_reset();
        ami_fill_iid();
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        redirect_from_ami=true;
        ami_enterdb();
        
        //redirect to update stocks page
        AddMobInfo.setVisible(false);         //Experimental
        UpdateStock.setVisible(true);
        
        jTextField49.setEditable(false);
        jComboBox7.removeAll();
        jComboBox7.addItem(jTextField1.getText());
        jComboBox7.setSelectedIndex(0);
        jComboBox7.setEditable(false);
        
        jComboBox8.removeAll();
        jComboBox8.addItem(jTextField4.getText());
        jComboBox8.setSelectedIndex(0);
        jComboBox8.setEditable(false);
        
        us_auto_fill_BId();
        ami_reset();
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        if(redirect_from_ami==true || redirect_from_aai==true)
        {
            us_r_stock_enterdb();
            us_stockio_enterdb();
            us_bills_enterdb();
            UpdateStock.setVisible(false);        //Experimental
            
            //Experimental
            //reseting the booleans
            redirect_from_aai=redirect_from_ami=false;
            us_reset();
        }
        else  
        {
            us_stock_enterdb();
            us_stockio_enterdb();
            us_bills_enterdb();
            
            // //Experimental below
            us_reset();
            //us_auto_fill_BId();     //for consequitive updations
            //UpdateStock.setVisible(false);       
        }
        redirect_from_ami=false;
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jTextField66ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField66ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField66ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        ami_reset();
        AddMobInfo.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        initiate();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        aai_reset();
        AddAccInfo.setVisible(true);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        aai_enterdb();
        
        //clear after entering
        aai_reset();
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        String str=JOptionPane.showInputDialog(this, "Enter the new type of accessory below.\n(All types entered are temporary until assigned to an accessory.)");
        jComboBox9.addItem(str);
        jComboBox9.setSelectedItem(str);
        
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        aai_enterdb();
        redirect_from_aai=true;
        
        //us_reset()
        jComboBox7.removeAllItems();
        jComboBox7.addItem(jTextField61.getText());
        jComboBox7.setSelectedItem(jTextField61.getText());
        
        jComboBox8.removeAllItems();
        jComboBox8.addItem(jTextField62.getText());
        jComboBox8.setSelectedItem(jTextField62.getText());
        
        //Experimental
        jTextField49.setText("");
        jTextField49.setEditable(false);
        jTextField60.setText("");
        
        UpdateStock.setVisible(true);
        //clear aai
        AddAccInfo.setVisible(false);
        aai_reset();
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        UpdateStock.setVisible(true);
        us_reset();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        us_reset();
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jComboBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox7ActionPerformed
        // TODO add your handling code here:
        us_fill_by_iid();
    }//GEN-LAST:event_jComboBox7ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        umi_reset();
        UpdateMobInfo.setVisible(true);
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jComboBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox5ActionPerformed
        // TODO add your handling code here:
        umi_fill_by_iid();
    }//GEN-LAST:event_jComboBox5ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        uai_reset();
        UpdateAccInfo.setVisible(true);
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jComboBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox12ActionPerformed
        // TODO add your handling code here:
        uai_fill_by_iid();
    }//GEN-LAST:event_jComboBox12ActionPerformed

    private void jComboBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox11ActionPerformed
        // TODO add your handling code here:
        uai_fill_by_devname();
    }//GEN-LAST:event_jComboBox11ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        uai_delete();
        uai_reset();
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        uai_reset();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        aai_reset();
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        
        jList1.removeAll();
        sm_rating();
        
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
        SearchMob.setVisible(true);
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
        // TODO add your handling code here:
        SearchMob.setVisible(true);
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jMenuItem13ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        sm_smartrec();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        redirect_sell_stock(jList3.getSelectedValue()+"");
        SearchMob.setVisible(false);
        //clear search mob
        
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        redirect_sell_stock(jList1.getSelectedValue()+"");
        SearchMob.setVisible(false);
        //clear search mob
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // TODO add your handling code here:
        SellStock.setVisible(true);
        ss_reset();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jComboBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox13ActionPerformed
        // TODO add your handling code here:
        ss_fill_cusdetails();
    }//GEN-LAST:event_jComboBox13ActionPerformed

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField37ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        
        //add to cart
        ss_addToCart();
        jTextField33.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jComboBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox10ActionPerformed
        // TODO add your handling code here:
        try
        {
            DBConnection db= new DBConnection();
            db.pstmt=db.con.prepareStatement("select name from itemindex where itemid=?");
            db.pstmt.setString(1,jComboBox10.getSelectedItem()+"");
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
            {
                jComboBox4.setSelectedItem(db.rst.getString(1));
                jTextField33.setText("");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox10ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
        try
        {
            DBConnection db= new DBConnection();
            db.pstmt=db.con.prepareStatement("select itemid from itemindex where name=?");
            db.pstmt.setString(1,jComboBox4.getSelectedItem()+"");
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
            {
                jComboBox10.setSelectedItem(db.rst.getString(1));
                jTextField33.setText("");
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton1.isSelected())
        {
            jButton28.setVisible(true);
            ss_new_cus();
        }
        else
        {
            jButton28.setVisible(false);
            jComboBox13.removeAllItems();
            try
            {
                DBConnection db = new DBConnection();
                db.pstmt=db.con.prepareStatement("select cusid from customer");
                db.rst=db.pstmt.executeQuery();
                while (db.rst.next())
                {
                    jComboBox13.addItem(db.rst.getString(1));
                }
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jToggleButton1StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jToggleButton1StateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jToggleButton1StateChanged

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        String st=jList4.getSelectedValue()+"";
        cart.remove(st);
        jList4.setListData(cart);
        
        if (!st.startsWith("!!!"))
        {
            tprice=tprice-Integer.parseInt(st.substring(st.lastIndexOf(":")+2,st.length()));
            titems--;
            jLabel77.setText(tprice+"");
            jLabel75.setText(titems+"");
        }
        jButton27.setEnabled(false);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ss_buynow();
        ss_reset();
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        ss_reset();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        if(jToggleButton1.isSelected())
            ss_add_cus();
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        uai_update();
        uai_reset();
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jList4ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList4ValueChanged
        // TODO add your handling code here:
        
        
        jButton27.setEnabled(true);
    }//GEN-LAST:event_jList4ValueChanged

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        String nname=JOptionPane.showInputDialog("Enter new Name");
        jComboBox11.addItem(nname);
        jComboBox11.setSelectedItem(nname);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ChangePass.setVisible(true);
        cp_reset();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        cp_confirm();
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        cp_submit();
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jComboBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox8ActionPerformed
        // TODO add your handling code here:
        us_fill_by_devname();
    }//GEN-LAST:event_jComboBox8ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        // TODO add your handling code here:
        SearchMob.setVisible(true);
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        try
        {
            String st=java.time.LocalTime.now()+"";
            st=st.substring(0,st.length()-4);
            st=st.replace(":","");
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("update loginhistory set etime=? order by logid DESC limit 1");
            db.pstmt.setString(1, st);
            db.pstmt.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        LoginPage.launch_Login();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
        try
        {
            String st=java.time.LocalTime.now()+"";
            st=st.substring(0,st.length()-4);
            st=st.replace(":","");
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("update loginhistory set etime=? order by logid DESC limit 1");
            db.pstmt.setString(1, st);
            db.pstmt.executeUpdate();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.exit(0);
        
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeHome().setVisible(true);
            }
        });
    }
    public static void launch_Employee() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeHome().setVisible(true);
            }
        });
    }
    
//codes
    
public String currdate()
{
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
    Date date = new Date();  
    return (formatter.format(date));  
}
    
public String gen_nxt_index(String str)
{
	char ch=str.charAt(0);
	int num=Integer.parseInt(str.substring(1,7))+1;
	str=num+"";
	while(str.length()!=6)
	{
		str="0"+str;
	}
	str=ch+str;
        return str;
}

// Manual Code Below

public void initiate()
{
    AddAccInfo.setVisible(false);
    AddMobInfo.setVisible(false);
    ChangePass.setVisible(false);
    SearchMob.setVisible(false);
    SellStock.setVisible(false);
    UpdateAccInfo.setVisible(false);
    UpdateMobInfo.setVisible(false);
    UpdateStock.setVisible(false);
    
    //password fields
    jPasswordField1.setText("");
    jPasswordField2.setText("");
    jPasswordField3.setText("");
    
    //text Area
    jTextArea1.setText("");
    jTextArea2.setText("");
    jTextArea3.setText("");
    jTextArea4.setText("");
    
    //Clear Text Fields
    clrtf();
}

public void clrtf()
{
    jTextField1.setText("");
    jTextField10.setText("");
    jTextField11.setText("");
    jTextField12.setText("");
    jTextField13.setText("");
    jTextField14.setText("");
    jTextField15.setText("");
    jTextField16.setText("");
    jTextField17.setText("");
    jTextField18.setText("");
    jTextField19.setText("");
    jTextField2.setText("");
    jTextField20.setText("");
    jTextField21.setText("");
    jTextField22.setText("");
    jTextField23.setText("");
    jTextField24.setText("");
    jTextField25.setText("");
    jTextField26.setText("");
    jTextField27.setText("");
    jTextField28.setText("");
    jTextField29.setText("");
    jTextField3.setText("");
    jTextField30.setText("");
    jTextField32.setText("");
    jTextField33.setText("");
    jTextField35.setText("");
    jTextField36.setText("");
    jTextField37.setText("");
    jTextField38.setText("");
    jTextField41.setText("");
    jTextField42.setText("");
    jTextField43.setText("");
    jTextField44.setText("");
    jTextField45.setText("");
    jTextField46.setText("");
    jTextField47.setText("");
    jTextField48.setText("");
    jTextField49.setText("");
    jTextField5.setText("");
    jTextField50.setText("");
    jTextField51.setText("");
    jTextField53.setText("");
    jTextField54.setText("");
    jTextField55.setText("");
    jTextField56.setText("");
    jTextField57.setText("");
    jTextField58.setText("");
    jTextField59.setText("");
    jTextField6.setText("");
    jTextField60.setText("");
    jTextField61.setText("");
    jTextField62.setText("");
    jTextField64.setText("");
    jTextField66.setText("");
    jTextField7.setText("");
    jTextField8.setText("");
    jTextField9.setText("");
    jTextField4.setText("");
}
    
//Functions related to Add Mobile Info
public void ami_reset()
{
    jTextField1.setText("");
    jTextField2.setText("");
    jTextField3.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField6.setText("");
    jTextField7.setText("");
    jTextField8.setText("");
    jTextField9.setText("");
    jTextField10.setText("");
    jTextField11.setText("");
    jTextField12.setText("");
    jTextField13.setText("");
    jTextField14.setText("");
    jTextField15.setText("");
    jTextField16.setText("");
    jTextField17.setText("");
    jTextArea1.setText("");
    jSlider1.setValue(1);
    jSlider2.setValue(1);
    jSlider3.setValue(1);
    jSlider4.setValue(1);
    jSlider5.setValue(1);
    jSlider6.setValue(1);
    jSlider7.setValue(1);
    
    jTextField1.setEditable(false);
    ami_fill_iid();
}

public String ami_gen_iid()
{
    String newiid="";
        try
        {
            
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("select itemid from mobile order by itemid desc limit 1");
            db.rst=db.pstmt.executeQuery();
            if (db.rst.next())
            {
                    newiid=db.rst.getString(1);
                    newiid=gen_nxt_index(newiid);
            }
            else
                    newiid="m000001";
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }  
        return newiid;
}
public void ami_fill_iid()
{
    jTextField1.setText(ami_gen_iid());
}
public void ami_enterdb()
{
    try
    {
        DBConnection db = new DBConnection();
        db.pstmt=db.con.prepareStatement("insert into mobile values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
        db.pstmt.setString(1,jTextField1.getText());
            db.pstmt.setString(2,jTextField4.getText());
            db.pstmt.setString(3,jTextField2.getText());
            db.pstmt.setString(4,jTextField3.getText());
            db.pstmt.setString(5,jTextField5.getText());
            db.pstmt.setString(6,jTextField6.getText());
            db.pstmt.setString(7,jTextField7.getText());
            db.pstmt.setString(8,jTextField8.getText());
            db.pstmt.setString(9,jTextField9.getText());
            db.pstmt.setString(10,jTextField10.getText());
            db.pstmt.setString(11,jTextField11.getText());
            db.pstmt.setString(12,jTextField12.getText());
            db.pstmt.setString(13,jTextField13.getText());
            db.pstmt.setString(14,jTextField14.getText());
            db.pstmt.setString(15,jTextField15.getText());
            db.pstmt.setString(16,jTextField16.getText());
            db.pstmt.setString(17,jTextField17.getText());
            db.pstmt.setString(18,jTextArea1.getText());
            db.pstmt.setString(19,jSlider1.getValue()+"");
            db.pstmt.setString(20,jSlider2.getValue()+"");
            db.pstmt.setString(21,jSlider3.getValue()+"");
            db.pstmt.setString(22,jSlider4.getValue()+"");
            db.pstmt.setString(23,jSlider5.getValue()+"");
            db.pstmt.setString(24,jSlider6.getValue()+"");
            db.pstmt.setString(25,jSlider7.getValue()+"");
            int i=db.pstmt.executeUpdate();
            
            db.pstmt=db.con.prepareStatement("insert into itemindex values (?,?)");
            db.pstmt.setString(1,jTextField1.getText());
            db.pstmt.setString(2,jTextField4.getText());
            i=db.pstmt.executeUpdate();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}

// Functions related to Update Stock called from Add Mobile Info

public void us_stock_enterdb()
{
    try
    {
        int x=Integer.parseInt(jTextField58.getText());
        
        DBConnection db = new DBConnection();
        db.pstmt=db.con.prepareStatement("update stock set qty=qty+?, price=? where itemid=?");
        db.pstmt.setString(1,jTextField58.getText());
        db.pstmt.setString(2,jTextField60.getText());
        db.pstmt.setString(3,jComboBox7.getSelectedItem()+"");
        int i=db.pstmt.executeUpdate();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}

public void us_r_stock_enterdb()
{
    try
    {
        DBConnection db = new DBConnection();
        db.pstmt=db.con.prepareStatement("insert into stock values(?,?,?)");
        db.pstmt.setString(1,jComboBox7.getSelectedItem()+"");
        db.pstmt.setString(2,jTextField58.getText());
        db.pstmt.setString(3,jTextField60.getText());
        int i=db.pstmt.executeUpdate();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}

public void us_stockio_enterdb()
{
    try
    {
        DBConnection db = new DBConnection();
        db.pstmt=db.con.prepareStatement("insert into stockio values(?,?,?,?,?)");
        db.pstmt.setString(1,jTextField59.getText());
        db.pstmt.setString(2,jComboBox7.getSelectedItem()+"");
        db.pstmt.setString(3,"DEALER");
        db.pstmt.setString(4,jTextField58.getText());
        db.pstmt.setString(5,currdate());
        int i=db.pstmt.executeUpdate();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}

public void us_bills_enterdb()
{
    try
    {
        DBConnection db = new DBConnection();
        db.pstmt=db.con.prepareStatement("insert into bills values(?,?,?)");
        db.pstmt.setString(1,jTextField59.getText());
        db.pstmt.setString(2,"DEALER");
        db.pstmt.setString(3,jTextField60.getText());
        int i=db.pstmt.executeUpdate();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}

//Functions Related to Add Accessory Info
public void aai_reset()
{
    jTextField61.setText("");
    jTextField62.setText("");
    jTextArea3.setText("");
    jComboBox9.removeAllItems();
    aai_fill_iid();
    aai_fillType();
}
public String aai_gen_iid()
{
    String newiid="";
        try
        {
            
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("select itemid from accessories order by itemid desc limit 1");
            db.rst=db.pstmt.executeQuery();
            if (db.rst.next())
            {
                    newiid=db.rst.getString(1);
                    newiid=gen_nxt_index(newiid);
            }
            else
                    newiid="a000001";
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }  
        return newiid;
}
public void aai_fill_iid()
{
    jTextField61.setText(aai_gen_iid());
}
public void aai_fillType()
{
    try
    {
        DBConnection db = new DBConnection();
        db.pstmt=db.con.prepareStatement("select distinct(type) from accessories");
        db.rst=db.pstmt.executeQuery();
        while(db.rst.next())
        {
            jComboBox9.addItem(db.rst.getString(1));
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
public void aai_enterdb()
{
    try
    {
        DBConnection db = new DBConnection();
        db.pstmt=db.con.prepareStatement("insert into accessories values(?,?,?,?)");
        db.pstmt.setString(1,jTextField61.getText());
        db.pstmt.setString(2,jTextField62.getText());
        db.pstmt.setString(3,jComboBox9.getSelectedItem()+"");
        db.pstmt.setString(4,jTextArea3.getText());
        int i=db.pstmt.executeUpdate();
        System.out.println("insertion to accessories table successful");
        
        db.pstmt=db.con.prepareStatement("insert into itemindex values(?,?)");
        db.pstmt.setString(1,jTextField61.getText());
        db.pstmt.setString(2,jTextField62.getText());
        i=db.pstmt.executeUpdate();
        System.out.println("insertion to itemindex table successful");
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}


//Function related to Update Stock
public void us_reset()
{
    jComboBox7.removeAllItems();
    jComboBox8.removeAllItems();
    jTextField58.setText("0");
    jTextField49.setText("");
    jTextField59.setText("");
    jTextField60.setText("");
    
    jTextField49.setEditable(false);
    
    us_fill_iid();
    us_fill_devname();
    us_auto_fill_BId();
}
public void us_fill_iid()
{
    try
        {
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("select itemid from stock");
            db.rst=db.pstmt.executeQuery();
            while (db.rst.next())
            {
                jComboBox7.addItem(db.rst.getString(1));
            }
        }
        catch(Exception e)
        {
                e.printStackTrace();
        } 
}
public void us_fill_devname()
{
    try
        {
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("select name from mobile");
            db.rst=db.pstmt.executeQuery();
            while (db.rst.next())
            {
                jComboBox8.addItem(db.rst.getString(1));
            }
            db.pstmt=db.con.prepareStatement("select name from accessories");
            db.rst=db.pstmt.executeQuery();
            while (db.rst.next())
            {
                jComboBox8.addItem(db.rst.getString(1));
            }
        }
        catch(Exception e)
        {
                e.printStackTrace();
        } 
}
public void us_auto_fill_BId()
{
    String newbid="";
    try
    {
                DBConnection db = new DBConnection();
                db.pstmt=db.con.prepareStatement("select billid from bills order by billid desc limit 1");
                db.rst=db.pstmt.executeQuery();
                if (db.rst.next())
                {
                        newbid=db.rst.getString(1);
                        newbid=gen_nxt_index(newbid);
                }
                else
                {
                        newbid="B000001";
                }
                jTextField59.setText(newbid);
        }
        catch(Exception e)
        {
                e.printStackTrace();
        } 
}
public void us_fill_by_iid()
{
        try
        {
            String id=jComboBox7.getSelectedItem()+"";
            if(id.charAt(0)=='a')
                {
                DBConnection db = new DBConnection();
                db.pstmt=db.con.prepareStatement("select * from accessories where itemid=\""+id+"\"");
                db.rst=db.pstmt.executeQuery();
                while (db.rst.next())
                {
                    jComboBox8.setSelectedItem(db.rst.getString(2));
                }
                
                db.pstmt=db.con.prepareStatement("select * from stock where itemid=\""+id+"\"");
                db.rst=db.pstmt.executeQuery();
                while (db.rst.next())
                {
                    jTextField49.setText(db.rst.getString(2));
                    jTextField60.setText(db.rst.getString(3));
                }
            }
            else if(id.charAt(0)=='m')
                {
                DBConnection db = new DBConnection();
                db.pstmt=db.con.prepareStatement("select * from mobile where itemid=\""+id+"\"");
                db.rst=db.pstmt.executeQuery();
                while (db.rst.next())
                {
                    jComboBox8.setSelectedItem(db.rst.getString(2));
                }
                
                db.pstmt=db.con.prepareStatement("select * from stock where itemid=\""+id+"\"");
                db.rst=db.pstmt.executeQuery();
                while (db.rst.next())
                {
                    jTextField49.setText(db.rst.getString(2));
                    jTextField60.setText(db.rst.getString(3));
                }
            }
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }
}
public void us_fill_by_devname()//optimised
{
        try
        {
            String id=jComboBox8.getSelectedItem()+"";
            DBConnection db1 = new DBConnection();
            db1.pstmt=db1.con.prepareStatement("select itemid from itemindex where name=?");
            db1.pstmt.setString(1, id);
            db1.rst=db1.pstmt.executeQuery();
            if(db1.rst.next())
            {
            	id=db1.rst.getString(1);
            }
            jComboBox7.setSelectedItem(id);
            if(id.charAt(0)=='a')
                {
                DBConnection db = new DBConnection();
                db.pstmt=db.con.prepareStatement("select * from accessories where itemid=\""+id+"\"");
                db.rst=db.pstmt.executeQuery();
                while (db.rst.next())
                {
                    jComboBox8.setSelectedItem(db.rst.getString(2));
                }
                
                db.pstmt=db.con.prepareStatement("select * from stock where itemid=\""+id+"\"");
                db.rst=db.pstmt.executeQuery();
                while (db.rst.next())
                {
                    jTextField49.setText(db.rst.getString(2));
                    jTextField60.setText(db.rst.getString(3));
                }
            }
            else if(id.charAt(0)=='m')
                {
                DBConnection db = new DBConnection();
                db.pstmt=db.con.prepareStatement("select * from mobile where itemid=\""+id+"\"");
                db.rst=db.pstmt.executeQuery();
                while (db.rst.next())
                {
                    jComboBox8.setSelectedItem(db.rst.getString(2));
                }
                
                db.pstmt=db.con.prepareStatement("select * from stock where itemid=\""+id+"\"");
                db.rst=db.pstmt.executeQuery();
                while (db.rst.next())
                {
                    jTextField49.setText(db.rst.getString(2));
                    jTextField60.setText(db.rst.getString(3));
                }
            }
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }
}

//  Functions related to Update Mobile Information
public void umi_reset()
{
    jTextField41.setText("");
    jTextField42.setText("");
    jTextField43.setText("");
    jTextField44.setText("");
    jTextField45.setText("");
    jTextField46.setText("");
    jTextField47.setText("");
    jTextField48.setText("");
    jTextField50.setText("");
    jTextField51.setText("");
    jTextField53.setText("");
    jTextField54.setText("");
    jTextField55.setText("");
    jTextField56.setText("");
    jTextField57.setText("");
    jComboBox5.removeAllItems();
    jComboBox6.removeAllItems();
    jSlider8.setValue(0);
    jSlider9.setValue(0);
    jSlider10.setValue(0);
    jSlider11.setValue(0);
    jSlider12.setValue(0);
    jSlider13.setValue(0);
    jSlider14.setValue(0);
    jTextArea2.setText("");
    
    //fill combo box
    umi_filliid();
    umi_fill_devname();
}
public void umi_filliid()
{
    try
        {
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("select itemid from mobile");
            db.rst=db.pstmt.executeQuery();
            while (db.rst.next())
            {
                jComboBox5.addItem(db.rst.getString(1));
            }
        }
        catch(Exception e)
        {
                e.printStackTrace();
        } 
}
public void umi_fill_devname()
{
    try
        {
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("select name from mobile");
            db.rst=db.pstmt.executeQuery();
            while (db.rst.next())
            {
                jComboBox6.addItem(db.rst.getString(1));
            }
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }
}
public void umi_fill_by_iid()
{
    try
    {
        DBConnection db =new DBConnection();
        db.pstmt=db.con.prepareStatement("select * from mobile where itemid=?");
        db.pstmt.setString(1,jComboBox5.getSelectedItem()+"");
        db.rst=db.pstmt.executeQuery();
        while(db.rst.next())
        {
            jComboBox6.setSelectedItem(db.rst.getString(2));
            jTextField50.setText(db.rst.getString(3));
            jTextField51.setText(db.rst.getString(4));
            jTextField53.setText(db.rst.getString(5));
            jTextField54.setText(db.rst.getString(6));
            jTextField55.setText(db.rst.getString(7));
            jTextField56.setText(db.rst.getString(8));
            jTextField57.setText(db.rst.getString(9));
            jTextField41.setText(db.rst.getString(10));
            jTextField42.setText(db.rst.getString(11));
            jTextField43.setText(db.rst.getString(12));
            jTextField44.setText(db.rst.getString(13));
            jTextField45.setText(db.rst.getString(14));
            jTextField46.setText(db.rst.getString(15));
            jTextField47.setText(db.rst.getString(16));
            jTextField48.setText(db.rst.getString(17));
            jTextArea2.setText(db.rst.getString(18));
            jSlider8.setValue(Integer.parseInt(db.rst.getString(19)));
            jSlider9.setValue(Integer.parseInt(db.rst.getString(20)));
            jSlider10.setValue(Integer.parseInt(db.rst.getString(21)));
            jSlider11.setValue(Integer.parseInt(db.rst.getString(22)));
            jSlider12.setValue(Integer.parseInt(db.rst.getString(23)));
            jSlider13.setValue(Integer.parseInt(db.rst.getString(24)));
            jSlider14.setValue(Integer.parseInt(db.rst.getString(25)));
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
public void umi_update()
{
    try
    {
        DBConnection db = new DBConnection();
        db.pstmt=db.con.prepareStatement("update mobile set  company=?, model=?, ram=?, screensize=?, screenres=?, screentype=?, screenppi=?, pcamera=?, scamera=?, battery=?, processor=?, clock=?, cores=?, memory=?, colours=?, addinfo=?, rcamera=?, rbattery=?, rperformance=?, rvom=?, rscreen=?, rdurability=?, roverall=? where itemid=?");
        //db.pstmt.setString(1,jComboBox5.getSelectedItem()+"");
        //db.pstmt.setString(2,jComboBox6.getSelectedItem()+"");
        db.pstmt.setString(1,jTextField50.getText());
        db.pstmt.setString(2,jTextField51.getText());
        db.pstmt.setString(3,jTextField53.getText());
        db.pstmt.setString(4,jTextField54.getText());
        db.pstmt.setString(5,jTextField55.getText());
        db.pstmt.setString(6,jTextField56.getText());
        db.pstmt.setString(7,jTextField57.getText());
        db.pstmt.setString(8,jTextField41.getText());
        db.pstmt.setString(9,jTextField42.getText());
        db.pstmt.setString(10,jTextField43.getText());
        db.pstmt.setString(11,jTextField44.getText());
        db.pstmt.setString(12,jTextField45.getText());
        db.pstmt.setString(13,jTextField46.getText());
        db.pstmt.setString(14,jTextField47.getText());
        db.pstmt.setString(15,jTextField48.getText());
        db.pstmt.setString(16,jTextArea2.getText());
        db.pstmt.setString(17,jSlider8.getValue()+"");
        db.pstmt.setString(18,jSlider9.getValue()+"");
        db.pstmt.setString(19,jSlider10.getValue()+"");
        db.pstmt.setString(20,jSlider11.getValue()+"");
        db.pstmt.setString(21,jSlider12.getValue()+"");
        db.pstmt.setString(22,jSlider13.getValue()+"");
        db.pstmt.setString(23,jSlider14.getValue()+"");
        db.pstmt.setString(24 ,jComboBox5.getSelectedItem()+"");
        int i=db.pstmt.executeUpdate();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
public void umi_delete()
{
    String qtyleft="";
    try
    {
        DBConnection db = new DBConnection();
        db.pstmt=db.con.prepareStatement("delete from mobile where itemid=?");
        db.pstmt.setString(1,jComboBox4.getSelectedItem()+"");
        db.pstmt.execute();
        
        db.pstmt=db.con.prepareStatement("delete from itemindex where itemid=?");
        db.pstmt.setString(1,jComboBox4.getSelectedItem()+"");
        db.pstmt.execute();
        
        db.pstmt=db.con.prepareStatement("select qty from stock where itemid=?");
            db.pstmt.setString(1,jComboBox4.getSelectedItem()+"");
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
                qtyleft=db.rst.getString(1);
            
            db.pstmt=db.con.prepareStatement("delete from stock where itemid=?");
            db.pstmt.setString(1,jComboBox4.getSelectedItem()+"");
            db.pstmt.execute();
            
            //inserting the left stock of deleted item as stock out with bill id="DELETED"
            db.pstmt=db.con.prepareStatement("insert into stockio values(?,?,?,?,?)");
            db.pstmt.setString(1,"DELETED");
            db.pstmt.setString(2,jComboBox4.getSelectedItem()+"");
            db.pstmt.setString(3,"DELETED");
            db.pstmt.setString(4,qtyleft);
            db.pstmt.setString(5,currdate());
            db.pstmt.execute();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}

//Function related to update accessory info
public void uai_update()
{
    try
    {
        DBConnection db = new DBConnection();
        db.pstmt=db.con.prepareStatement("update accessories set name =?, type=?, description=? where itemid=?");
        db.pstmt.setString(1, jComboBox11.getSelectedItem()+"");
        db.pstmt.setString(2, jTextField66.getText());
        db.pstmt.setString(3, jTextArea4.getText());
        db.pstmt.setString(4, jComboBox12.getSelectedItem()+"");
        db.pstmt.execute();
        
        //edited
        db.pstmt=db.con.prepareStatement("update itemindex set name =? where itemid=?");
        db.pstmt.setString(1, jComboBox11.getSelectedItem()+"");
        db.pstmt.setString(2, jComboBox12.getSelectedItem()+"");
        db.pstmt.execute();
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}

public void uai_reset()
{
    jComboBox11.removeAllItems();
    jComboBox12.removeAllItems();
    jTextField6.setText("");
    jTextArea4.setText("");
    uai_fill_iid();
    uai_fill_devname();
}
public void uai_fill_iid()
{
    try
        {
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("select itemid from accessories");
            db.rst=db.pstmt.executeQuery();
            while (db.rst.next())
            {
                jComboBox12.addItem(db.rst.getString(1));
            }
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }
}
public void uai_fill_devname()
{
    try
        {
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("select name from accessories");
            db.rst=db.pstmt.executeQuery();
            while (db.rst.next())
            {
                jComboBox11.addItem(db.rst.getString(1));
            }
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }
}
public void uai_fill_by_iid()
{
    try
    {
        DBConnection db= new DBConnection();
        db.pstmt=db.con.prepareStatement("select * from accessories where itemid=?");
        db.pstmt.setString(1,jComboBox12.getSelectedItem()+"");
        db.rst=db.pstmt.executeQuery();
        if(db.rst.next())
        {
            jComboBox11.setSelectedItem(db.rst.getString(2));
            jTextField66.setText(db.rst.getString(3));
            jTextArea4.setText(db.rst.getString(4));
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}    
public void uai_fill_by_devname()
{
    try
    {
        DBConnection db= new DBConnection();
        db.pstmt=db.con.prepareStatement("select * from accessories where name=?");
        db.pstmt.setString(1,jComboBox11.getSelectedItem()+"");
        db.rst=db.pstmt.executeQuery();
        if(db.rst.next())
        {
            jComboBox12.setSelectedItem(db.rst.getString(1));
            jTextField66.setText(db.rst.getString(3));
            jTextArea4.setText(db.rst.getString(4));
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}    

public void uai_delete()
{
    String qtyleft="";
    try
        {
            DBConnection db=new DBConnection();
            db.pstmt=db.con.prepareStatement("delete from accessories where itemid=?");
            db.pstmt.setString(1,jComboBox12.getSelectedItem()+"");
            db.pstmt.execute();
            
            db.pstmt=db.con.prepareStatement("delete from itemindex where itemid=?");
            db.pstmt.setString(1,jComboBox12.getSelectedItem()+"");
            db.pstmt.execute();
            
            db.pstmt=db.con.prepareStatement("select qty from stock where itemid=?");
            db.pstmt.setString(1,jComboBox12.getSelectedItem()+"");
            db.rst=db.pstmt.executeQuery();
            if(db.rst.next())
                qtyleft=db.rst.getString(1);
            
            db.pstmt=db.con.prepareStatement("delete from stock where itemid=?");
            db.pstmt.setString(1,jComboBox12.getSelectedItem()+"");
            db.pstmt.execute();
            
            //inserting the left stock of deleted item as stock out with bill id="DELETED"
            db.pstmt=db.con.prepareStatement("insert into stockio values(?,?,?,?,?)");
            db.pstmt.setString(1,"DELETED");
            db.pstmt.setString(2,jComboBox12.getSelectedItem()+"");
            db.pstmt.setString(3,"DELETED");
            db.pstmt.setString(4,qtyleft);
            db.pstmt.setString(5,currdate());
            db.pstmt.execute();
            
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
}
//Function related to search mobile
public void sm_rating()
{
    Vector<String> dev_found=new Vector<String>();
    int i=0;
        try
        {
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("select * from stock where itemid like \"m%\" and price between ? and ?");
            db.pstmt.setInt(1,Integer.parseInt(jTextField27.getText()));
            db.pstmt.setInt(2,Integer.parseInt(jTextField28.getText()));
            db.rst=db.pstmt.executeQuery();
            while(db.rst.next())
            {
            	//System.out.println(db.rst.getString(1));
                DBConnection db1 = new DBConnection();
                db1.pstmt=db1.con.prepareStatement("select itemid, name, (rcamera+rbattery+rperformance+rvom+rscreen+rdurability+roverall) as \"score\" from mobile where itemid=? and rcamera>=? and rbattery>=? and rperformance>=? and rvom>=? and rscreen>=? and rdurability>=? and roverall>=? order by score");
                db1.pstmt.setString(1,db.rst.getString(1));
                db1.pstmt.setInt(2,Integer.parseInt(jSpinner1.getValue()+""));
                db1.pstmt.setInt(3,Integer.parseInt(jSpinner2.getValue()+""));
                db1.pstmt.setInt(4,Integer.parseInt(jSpinner3.getValue()+""));
                db1.pstmt.setInt(5,Integer.parseInt(jSpinner4.getValue()+""));
                db1.pstmt.setInt(6,Integer.parseInt(jSpinner5.getValue()+""));
                db1.pstmt.setInt(7,Integer.parseInt(jSpinner6.getValue()+""));
                db1.pstmt.setInt(8,Integer.parseInt(jSpinner7.getValue()+""));
                db1.rst=db1.pstmt.executeQuery();
                while(db1.rst.next())
                {
                    //System.out.println(db1.rst.getString(1));
                    //System.out.println(db1.rst.getString(2));
                    dev_found.add(db1.rst.getString(1)+": "+db1.rst.getString(2)+"       (Score: "+db1.rst.getString(3)+"/70)");
                }
            }
            jList1.setListData(dev_found);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
}
public void sm_smartrec()
{
    Vector<String> dev_found=new Vector<String>();
    int i=0;
        try
        {
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("select * from stock where itemid like \"m%\" and price between ? and ?");
            db.pstmt.setInt(1,Integer.parseInt(jTextField29.getText()));
            db.pstmt.setInt(2,Integer.parseInt(jTextField30.getText()));
            db.rst=db.pstmt.executeQuery();
            while(db.rst.next())
            {
            	//System.out.println(db.rst.getString(1));
                DBConnection db1 = new DBConnection();
                db1.pstmt=db1.con.prepareStatement("select itemid, name, (rcamera+rbattery+rperformance+rvom+rscreen+rdurability+roverall) as \"score\" from mobile where itemid=? and rcamera>=? and rbattery>=? and rperformance>=? and rvom>=? and rscreen>=? and rdurability>=? and roverall>=? order by score");
                db1.pstmt.setString(1,db.rst.getString(1));
                db1.pstmt.setInt(2,jCheckBox1.isSelected()==true?7:1);
                db1.pstmt.setInt(3,jCheckBox2.isSelected()==true?7:1);
                db1.pstmt.setInt(4,jCheckBox3.isSelected()==true?7:1);
                db1.pstmt.setInt(5,jCheckBox4.isSelected()==true?7:1);
                db1.pstmt.setInt(6,jCheckBox5.isSelected()==true?7:1);
                db1.pstmt.setInt(7,jCheckBox6.isSelected()==true?7:1);
                db1.pstmt.setInt(8,jCheckBox9.isSelected()==true?7:1);
                db1.rst=db1.pstmt.executeQuery();
                while(db1.rst.next())
                {
                    //System.out.println(db1.rst.getString(1));
                    //System.out.println(db1.rst.getString(2));
                    dev_found.add(db1.rst.getString(1)+": "+db1.rst.getString(2)+"       (Score: "+db1.rst.getString(3)+"/70)");
                    //System.out.println("Score="+db1.rst.getString(3));
                }
            }
            jList3.setListData(dev_found);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
}
public void redirect_sell_stock(String str)
{
    ss_reset();
    SellStock.setVisible(true);
    jComboBox10.setSelectedItem(str.substring(0, 7));
    jComboBox4.setSelectedItem((str.substring(8,str.indexOf('('))).trim());
}

//functions related to sellstock()
public void ss_reset()
{
        ss_gen_billid();
        ss_fill_id_name();
        
        cart.clear();
        jList4.setListData(cart);
        
        titems=0;
        tprice=0;
        
        jLabel77.setText("");
        jLabel75.setText("");
        jButton28.setVisible(false);
        jButton27.setEnabled(false);
}
public void ss_gen_billid()
{
    String newiid="";
        try
        {
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("select billid from bills order by billid desc limit 1");
            db.rst=db.pstmt.executeQuery();
            if (db.rst.next())
            {
                    newiid=db.rst.getString(1);
                    newiid=gen_nxt_index(newiid);
            }
            else
                    newiid="B000001";
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }  
        jLabel72.setText(newiid);
}
public void ss_fill_id_name()
{
        jComboBox10.removeAllItems();
        jComboBox4.removeAllItems();
        jComboBox13.removeAllItems();
        try
        {
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("select itemid, name from itemindex");
            db.rst=db.pstmt.executeQuery();
            while (db.rst.next())
            {
                    jComboBox10.addItem(db.rst.getString(1));
                    jComboBox4.addItem(db.rst.getString(2));
            }
            
            db.pstmt=db.con.prepareStatement("select cusid from customer");
            db.rst=db.pstmt.executeQuery();
            while (db.rst.next())
            {
                    jComboBox13.addItem(db.rst.getString(1));
            }
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }  
}
public void ss_fill_cusdetails()
{
    try
    {
        DBConnection db = new DBConnection();
        db.pstmt=db.con.prepareStatement("select * from customer where cusid=?");
        db.pstmt.setString(1, jComboBox13.getSelectedItem()+"");
        db.rst=db.pstmt.executeQuery();
        while (db.rst.next())
        {
              jTextField35.setText(db.rst.getString(2));
              jTextField36.setText(db.rst.getString(3));
              jTextField37.setText(db.rst.getString(4));
              String date=(db.rst.getString(5));
              System.out.println(date);
              jComboBox3.removeAllItems();
              jComboBox3.addItem(date.substring(0,4));
              jComboBox2.removeAllItems();
              jComboBox2.addItem(date.substring(5,7));
              jComboBox1.removeAllItems();
              jComboBox1.addItem(date.substring(8,10));
              jTextField38.setText(db.rst.getString(6));
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
public void ss_new_cus()
{
    jComboBox13.removeAllItems();
    String newiid="";
        try
        {
            DBConnection db = new DBConnection();
            db.pstmt=db.con.prepareStatement("select cusid from customer order by cusid desc limit 1");
            db.rst=db.pstmt.executeQuery();
            if (db.rst.next())
            {
                    newiid=db.rst.getString(1);
                    newiid=gen_nxt_index(newiid);
            }
            else
            {
                    newiid="C000001";
            }
            
            db.pstmt=db.con.prepareStatement("select cusid from customer");
            db.rst=db.pstmt.executeQuery();
            while (db.rst.next())
            {
                jComboBox13.addItem(db.rst.getString(1));
            }
        }
        catch(Exception e)
        {
                e.printStackTrace();
        }  
        
        
        jComboBox13.addItem(newiid+"");
        jComboBox13.setSelectedItem(newiid);
       ss_reset_cusfields();
}
public void ss_reset_cusfields()
{
    jTextField35.setText("");
    jTextField36.setText("");
    jTextField37.setText("");
    jTextField38.setText("");
    
    jComboBox1.removeAllItems();
    jComboBox2.removeAllItems();
    jComboBox3.removeAllItems();
    
    ss_date_fill();
    
}
public void ss_date_fill()
{
    for(int i=1;i<=31;i++)
    {
        jComboBox1.addItem(i);
    }
    for(int i=1;i<=12;i++)
    {
        jComboBox2.addItem(i);
    }
    for(int i=1970;i<=2012;i++)
    {
        jComboBox3.addItem(i);
        if (i%100==0)
        {
            if(i%400==0)
            {
                //leap 
                for(int j=1;j<=12;j++)
                {
                    jComboBox2.addItem(j);
                    if(j==2)
                    {
                        for(int k=1;k<=29;k++)
                        {
                            jComboBox1.addItem(k);
                        }
                    }
                    else if (j==6||j==11||j==5||j==9)
                    {
                        for(int k=1;k<=30;k++)
                        {
                            jComboBox1.addItem(k);
                        }
                    }
                    else
                    {
                        for(int k=1;k<=31;k++)
                        {
                            jComboBox1.addItem(k);
                        }
                    }
                }
            }
            else
            {
                //not leap
                for(int j=1;j<=12;j++)
                {
                    jComboBox2.addItem(j);
                    if(j==2)
                    {
                        for(int k=1;k<=28;k++)
                        {
                            jComboBox1.addItem(k);
                        }
                    }
                    else if (j==6||j==11||j==5||j==9)
                    {
                        for(int k=1;k<=30;k++)
                        {
                            jComboBox1.addItem(k);
                        }
                    }
                    else
                    {
                        for(int k=1;k<=31;k++)
                        {
                            jComboBox1.addItem(k);
                        }
                    }
                }
            }
        }
        else if (i%4==0)
        {
            //leap year
            for(int j=1;j<=12;j++)
                {
                    jComboBox2.addItem(j);
                    if(j==2)
                    {
                        for(int k=1;k<=29;k++)
                        {
                            jComboBox1.addItem(k);
                        }
                    }
                    else if (j==6||j==11||j==5||j==9)
                    {
                        for(int k=1;k<=30;k++)
                        {
                            jComboBox1.addItem(k);
                        }
                    }
                    else
                    {
                        for(int k=1;k<=31;k++)
                        {
                            jComboBox1.addItem(k);
                        }
                    }
                }
        }
        else
        {
            //not leap  
            for(int j=1;j<=12;j++)
                {
                    jComboBox2.addItem(j);
                    if(j==2)
                    {
                        for(int k=1;k<=28;k++)
                        {
                            jComboBox1.addItem(k);
                        }
                    }
                    else if (j==6||j==11||j==5||j==9)
                    {
                        for(int k=1;k<=30;k++)
                        {
                            jComboBox1.addItem(k);
                        }
                    }
                    else
                    {
                        for(int k=1;k<=31;k++)
                        {
                            jComboBox1.addItem(k);
                        }
                    }
                }
        }
    }
}

public void ss_add_cus()
{
    try
    {
        DBConnection db = new DBConnection();
        db.pstmt=db.con.prepareStatement("insert into customer values(?,?,?,?,?,?)");
        db.pstmt.setString(1,jComboBox13.getSelectedItem()+"");
        db.pstmt.setString(2,jTextField35.getText());
        db.pstmt.setString(3,jTextField36.getText());
        db.pstmt.setString(4,jTextField37.getText());
        db.pstmt.setString(5,jComboBox3.getSelectedItem()+"-"+jComboBox2.getSelectedItem()+"-"+jComboBox1.getSelectedItem());
        db.pstmt.setString(6,jTextField38.getText());
        db.pstmt.execute(); 
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
Vector<String> cart=new Vector<String>();
int tprice=0;
int titems=0;
public void ss_addToCart()
{
    String price="";
    try
    {
        DBConnection db = new DBConnection();
        db.pstmt=db.con.prepareStatement("select price from stock where itemid=?");
        db.pstmt.setString(1,jComboBox10.getSelectedItem()+"");
        db.rst=db.pstmt.executeQuery();
        
        if(db.rst.next())
        {
            price=db.rst.getString(1);
            titems++;
            tprice+=Integer.parseInt(price);
            
            cart.add(titems+") "+"  Itemid: "+jComboBox10.getSelectedItem()+"  Name: "+jComboBox4.getSelectedItem()+" ( "+jTextField33.getText()+" ) "+"   Price: "+price);
        }
        else
        {
             cart.add("!!!  Name: "+jComboBox4.getSelectedItem()+" --> STOCK OUT <--");
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
    jList4.setListData(cart);
    
    jLabel77.setText(tprice+"");
    jLabel75.setText(titems+"");
}
public void ss_buynow()
{
    try
    {
        DBConnection db = new DBConnection();
        for(int i=0;i<cart.size();i++)
        {
            if(!cart.elementAt(i).startsWith("!!!"))
            {
                db.pstmt=db.con.prepareStatement("update stock set qty=qty-1 where itemid=?");
                db.pstmt.setString(1,cart.elementAt(i).substring(cart.elementAt(i).indexOf(")")+12,20));
                db.pstmt.execute();
                
                db.pstmt=db.con.prepareStatement("insert into stockio values(?,?,?,?,?)");
                db.pstmt.setString(1, jLabel72.getText());
                db.pstmt.setString(2,cart.elementAt(i).substring(cart.elementAt(i).indexOf(")")+12,20));
                db.pstmt.setString(3, jComboBox13.getSelectedItem()+"");
                db.pstmt.setString(4,1+"");
                db.pstmt.setString(5, currdate());
                db.pstmt.execute();
            }
        }
        db.pstmt=db.con.prepareStatement("insert into bills values(?,?,?)");
        db.pstmt.setString(1, jLabel72.getText());
        db.pstmt.setString(2, jComboBox13.getSelectedItem()+"");
        db.pstmt.setString(3, jLabel77.getText());
        db.pstmt.execute();
        System.out.println("Stock updated");
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}

//functions related to Accounts'

public void cp_reset()
{
    jTextField32.setText(curruser);
    jTextField32.setEditable(false);
    jPasswordField1.setText("");
    jPasswordField2.setText("");
    jPasswordField3.setText("");
    
    jButton10.setEnabled(false);
    jPasswordField2.setEditable(false);
    jPasswordField3.setEditable(false);
    
    jButton9.setEnabled(true);
    jPasswordField1.setEditable(true);
}

public void cp_confirm()
{
    try
    {
        DBConnection db = new DBConnection();
        db.pstmt=db.con.prepareStatement("select name from users where username=? and password=?");
        db.pstmt.setString(1, curruser);
        db.pstmt.setString(2, jPasswordField1.getText());
        db.rst=db.pstmt.executeQuery();
        if(db.rst.next())
        {
                System.out.println("Access");
                jButton9.setEnabled(false);
                jPasswordField1.setEditable(false);
                
                jButton10.setEnabled(true);
                jPasswordField2.setEditable(true);
                jPasswordField3.setEditable(true);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Incorrect Password.\n Please try again..");
        }
    }
    catch(Exception e)
    {
        e.printStackTrace();
    }
}
public void cp_submit()
{
    try
    {
    	if(jPasswordField2.getText().equals(jPasswordField3.getText()))
    	{
                        DBConnection db = new DBConnection();
	        db.pstmt=db.con.prepareStatement("update users set password=? where username=?");
	        db.pstmt.setString(1,jPasswordField2.getText());
	        db.pstmt.setString(2,curruser);
	        db.pstmt.executeUpdate();
	        JOptionPane.showMessageDialog(this,"Password Updated Successfully");
	        ChangePass.setVisible(false);
	        cp_reset();
        }
    	else
    	{
    		JOptionPane.showMessageDialog(this,"(Err-001)Passwords don't match");
    	}
    }
    catch(Exception e)
    {
    	e.printStackTrace();
    }
}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JInternalFrame AddAccInfo;
    private javax.swing.JInternalFrame AddMobInfo;
    private javax.swing.JInternalFrame ChangePass;
    private javax.swing.JInternalFrame SearchMob;
    private javax.swing.JInternalFrame SellStock;
    private javax.swing.JInternalFrame UpdateAccInfo;
    private javax.swing.JInternalFrame UpdateMobInfo;
    private javax.swing.JInternalFrame UpdateStock;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox10;
    private javax.swing.JComboBox jComboBox11;
    private javax.swing.JComboBox jComboBox12;
    private javax.swing.JComboBox jComboBox13;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JComboBox jComboBox8;
    private javax.swing.JComboBox jComboBox9;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JList jList4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JPasswordField jPasswordField3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JSlider jSlider10;
    private javax.swing.JSlider jSlider11;
    private javax.swing.JSlider jSlider12;
    private javax.swing.JSlider jSlider13;
    private javax.swing.JSlider jSlider14;
    private javax.swing.JSlider jSlider2;
    private javax.swing.JSlider jSlider3;
    private javax.swing.JSlider jSlider4;
    private javax.swing.JSlider jSlider5;
    private javax.swing.JSlider jSlider6;
    private javax.swing.JSlider jSlider7;
    private javax.swing.JSlider jSlider8;
    private javax.swing.JSlider jSlider9;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField18;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField21;
    private javax.swing.JTextField jTextField22;
    private javax.swing.JTextField jTextField23;
    private javax.swing.JTextField jTextField24;
    private javax.swing.JTextField jTextField25;
    private javax.swing.JTextField jTextField26;
    private javax.swing.JTextField jTextField27;
    private javax.swing.JTextField jTextField28;
    private javax.swing.JTextField jTextField29;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField30;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField41;
    private javax.swing.JTextField jTextField42;
    private javax.swing.JTextField jTextField43;
    private javax.swing.JTextField jTextField44;
    private javax.swing.JTextField jTextField45;
    private javax.swing.JTextField jTextField46;
    private javax.swing.JTextField jTextField47;
    private javax.swing.JTextField jTextField48;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField51;
    private javax.swing.JTextField jTextField53;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToolBar jToolBar1;
    // End of variables declaration//GEN-END:variables
}