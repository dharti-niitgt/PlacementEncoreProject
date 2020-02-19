/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placements;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;


public class SupplAnalysisReport extends javax.swing.JFrame {
    
    String username="guest";
    /**
     * Creates new form HomeFrame
     */
    public SupplAnalysisReport(String username) {
        this.username = username;
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
 
    public SupplAnalysisReport() {
       
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        pnChart.setLayout(new java.awt.BorderLayout());
       
    }
 private DefaultCategoryDataset createDataset() {
        // same dataset for line chart and bar chart
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        if (jCourses.getSelectedIndex()==0) {
             dataset.addValue(17.5, jCourses.getItemAt(1), jCourses.getItemAt(1));
        dataset.addValue(20, jCourses.getItemAt(2), jCourses.getItemAt(2));
        dataset.addValue(10, jCourses.getItemAt(3), jCourses.getItemAt(3));
        
        dataset.addValue(20, jCourses.getItemAt(4), jCourses.getItemAt(4));
     
      
        dataset.addValue(30, jCourses.getItemAt(5), jCourses.getItemAt(5)); 
     }
     if (jCourses.getSelectedIndex()==1) {
         
             dataset.addValue(30, jAppraisals.getItemAt(1),"Mock Interview Round");
        dataset.addValue(50, jAppraisals.getItemAt(2),"Verbal Ability Round");
        dataset.addValue(20, jAppraisals.getItemAt(3), "Aptitude Test Round");
        
        dataset.addValue(10, jAppraisals.getItemAt(4), "Machine Test Round");
     
      }
     
      if (jCourses.getSelectedIndex()==2) {
         
             dataset.addValue(40, jAppraisals.getItemAt(1),"Mock Interview Round");
        dataset.addValue(20, jAppraisals.getItemAt(2),"Verbal Ability Round");
        dataset.addValue(30, jAppraisals.getItemAt(3), "Aptitude Test Round");
        
        dataset.addValue(20, jAppraisals.getItemAt(4), "Machine Test Round");
     
      }
      
      if (jCourses.getSelectedIndex()==3) {
         
             dataset.addValue(10, jAppraisals.getItemAt(1),"Mock Interview Round");
        dataset.addValue(10, jAppraisals.getItemAt(2),"Verbal Ability Round");
        dataset.addValue(20, jAppraisals.getItemAt(3), "Aptitude Test Round");
        
        dataset.addValue(30, jAppraisals.getItemAt(4), "Machine Test Round");
     
      }
      
      if (jCourses.getSelectedIndex()==4) {
         
             dataset.addValue(40, jAppraisals.getItemAt(1),"Mock Interview Round");
        dataset.addValue(60, jAppraisals.getItemAt(2),"Verbal Ability Round");
        dataset.addValue(50, jAppraisals.getItemAt(3), "Aptitude Test Round");
        
        dataset.addValue(30, jAppraisals.getItemAt(4), "Machine Test Round");
     
      }
      
      if (jCourses.getSelectedIndex()==5) {
         
             dataset.addValue(40, jAppraisals.getItemAt(1),"Mock Interview Round");
        dataset.addValue(45, jAppraisals.getItemAt(2),"Verbal Ability Round");
        dataset.addValue(30, jAppraisals.getItemAt(3), "Aptitude Test Round");
        
        dataset.addValue(40, jAppraisals.getItemAt(4), "Machine Test Round");
     
      }
        return dataset;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnChart = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jCourses = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jAppraisals = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(null);

        pnChart.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(pnChart);
        pnChart.setBounds(40, 180, 860, 440);

        jButton1.setText("View Summary");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(640, 640, 110, 23);

        jLabel2.setText("Course Name : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 640, 90, 14);

        jCourses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Courses", "PGFAG", "PGJS", "PG.NET", "GNIIT", "NCS" }));
        getContentPane().add(jCourses);
        jCourses.setBounds(130, 640, 100, 20);

        jLabel3.setText("Appraisal Code : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 640, 100, 14);

        jAppraisals.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Appraisals", "INTERVIEW", "ENGLISH", "APTITUDE", "MACHINE" }));
        jAppraisals.setEnabled(false);
        getContentPane().add(jAppraisals);
        jAppraisals.setBounds(430, 640, 120, 20);

        jButton2.setText("View Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(760, 640, 120, 23);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 10)); // NOI18N
        jLabel4.setText(username.toUpperCase());
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 20, 80, 20);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placements/logout.jpg"))); // NOI18N
        jButton6.setText("jButton6");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(903, 83, 70, 20);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/placements/allpages.jpg"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1026, 812);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  // create dataset for pie chart
        DefaultPieDataset dataset = new DefaultPieDataset();
        if (jCourses.getSelectedIndex()==0) {
            
        
        dataset.setValue("PGFAG", new Double(17.5));
        dataset.setValue("PGJS", new Double(7));
        dataset.setValue("GNIIT", new Double(4));
        dataset.setValue("NCS", new Double(10));
        // create pir chart
        }
        
        if (jCourses.getSelectedIndex()==1) {
              dataset.setValue("Excel", new Double(1));
        dataset.setValue("Tally", new Double(2));
        dataset.setValue("ABATT", new Double(4));
        dataset.setValue("GST", new Double(1));dataset.setValue("CFMA", new Double(3));
        }
        
         if (jCourses.getSelectedIndex()==2) {
              dataset.setValue("PIJ", new Double(3));
        dataset.setValue("JSP", new Double(2));
        dataset.setValue("HTML", new Double(1));
        dataset.setValue("PS", new Double(1));
        }
         
          if (jCourses.getSelectedIndex()==3) {
              dataset.setValue("C#", new Double(1));
        dataset.setValue("ASP", new Double(2));
        dataset.setValue("SQL", new Double(3));
        }
          
           if (jCourses.getSelectedIndex()==4) {
              dataset.setValue("TERM1", new Double(1));
        dataset.setValue("TERM2", new Double(1));
        dataset.setValue("TERM3", new Double(2));
     
        }
        JFreeChart chart = ChartFactory.createPieChart3D(
                "Number of Days needed to complete Supplementary after Batch ED", // chart title                   
                dataset, // data 
                true, // include legend                   
                true,
                false);
        // set chart properties
        final PiePlot3D plot = (PiePlot3D) chart.getPlot();
        plot.setStartAngle(270);
        plot.setForegroundAlpha(0.60f);
        plot.setInteriorGap(0.02);
        // create chart panel the add it to swing panel in  jframe
        ChartPanel chartPanel = new ChartPanel(chart);
        pnChart.removeAll();        // clear panel before add new chart
        pnChart.add(chartPanel, BorderLayout.CENTER);
        pnChart.validate();         // refresh panel to display new chart
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        showTableData();
//          JFrame frame = new JFrame();
//      JPanel panel = new JPanel();
//         panel.setBorder(BorderFactory.createTitledBorder( BorderFactory.createBevelBorder(WIDTH), "Selection Analysis Report", TitledBorder.CENTER, TitledBorder.TOP));
//      String[][] rec = {
//         { "1", "Steve", "R200013300050","2020-01-01","2020-01-20","20","57" },
//         { "2", "Virat", "R200013300052","2020-01-01","2020-01-15","15","52" },
//         { "3", "Kane", "R200013300272","2020-01-03","2020-01-15","12","32" },
//         { "4", "David", "R200013300241","2020-01-10","2020-01-12","2","60" },
//         { "5", "Ben", "R200013300501","2020-01-06","2020-01-09","3","15" },
//         { "6", "Eion", "R200013300511","2020-01-05","2020-01-10","5","72" },
//         { "7", "Sachin", "R200013300501","2020-01-05","2020-01-15","10","55" }
//      
//        
//      };
//      String[] header = { "Rank", "Student Name", "Registration Code", "Batch Completion Date","Suppl Date" , "Days Lapsed", "Score" };
//      JTable table = new JTable(rec, header);
//      
//table.setFillsViewportHeight(true);
//table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
//JScrollPane scroll = new JScrollPane(table);
//scroll.setHorizontalScrollBarPolicy(
//JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
//scroll.setVerticalScrollBarPolicy(
//JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//      panel.add(new JScrollPane(table));
//     panel.setLayout(new FlowLayout());
//      frame.add(panel);
//      frame.setSize(800, 600);
//      frame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

public void showTableData()
{
String[] columnNames = {"STUDENT_NAME","REGISTRATION_CODE","BATCH_COMPLETION_DATE","SUPPL_DATE","DAYS_LAPSED","SCORE"};
JFrame panel1 = new JFrame("Database Search Result");
 
panel1.setLayout(new BorderLayout());
//TableModel tm = new TableModel();
DefaultTableModel model = new DefaultTableModel();
model.setColumnIdentifiers(columnNames);
//DefaultTableModel model = new DefaultTableModel(tm.getData1(), tm.getColumnNames());
//table = new JTable(model);
JTable table = new JTable();
table.setModel(model);
table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
table.setFillsViewportHeight(true);
JScrollPane scroll = new JScrollPane(table);
scroll.setHorizontalScrollBarPolicy(
JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
scroll.setVerticalScrollBarPolicy(
JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
//String textvalue = textbox.getText();
String name= "";
String reg= "";
String bc = "";
String sd = "";
String dl = "";
String score = "";
try
{
      String jdbcURL = "jdbc:h2:C:\\Users\\xyz\\Documents\\NetBeansProjects\\Placements\\db";
   String jdbcUsername = "sys";
   String jdbcPassword = "1234";

String driverName = "org.h2.Driver";
Class.forName(driverName);
Connection con = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
String sql = "select * from suppl_analysis";
PreparedStatement ps = con.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
int i =0;
while(rs.next())
{
name = rs.getString("STUDENT_NAME");
reg = rs.getString("REGISTRATION_CODE");
bc = rs.getString("BATCH_COMPLETION_DATE");
sd = rs.getString("SUPPL_DATE");
dl = rs.getString("DAYS_LAPSED");
score = rs.getString("SCORE");


model.addRow(new Object[]{name, reg, bc, sd, dl, score});
i++;
}
if(i <1)
{
JOptionPane.showMessageDialog(null, "No Record Found","Error",
JOptionPane.ERROR_MESSAGE);
}
if(i ==1)
{
System.out.println(i+" Record Found");
}
else
{
System.out.println(i+" Records Found");
}
}
catch(Exception ex)
{
JOptionPane.showMessageDialog(null, ex.getMessage(),"Error",
JOptionPane.ERROR_MESSAGE);
}
panel1.add(scroll);

panel1.setVisible(true);
panel1.setSize(400,300);
}
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
 if(JOptionPane.showConfirmDialog(null, "Are you sure ?") == JOptionPane.OK_OPTION){
                    setVisible(false);
                    dispose();
                    new MainFrame(username).setVisible(true);        // TODO add your handling code here:
 }
    }//GEN-LAST:event_formWindowClosing

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        dispose();
        new EncoreLogin().setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6MouseClicked
    
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
            java.util.logging.Logger.getLogger(SupplAnalysisReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SupplAnalysisReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SupplAnalysisReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SupplAnalysisReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SupplAnalysisReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jAppraisals;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jCourses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel pnChart;
    // End of variables declaration//GEN-END:variables
}
