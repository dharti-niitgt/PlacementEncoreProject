/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placements;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.time.LocalDate;
import java.time.ZoneOffset;
import java.util.Date;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.IntervalCategoryDataset;
import org.jfree.data.gantt.Task;
import org.jfree.data.gantt.TaskSeries;
import org.jfree.data.gantt.TaskSeriesCollection;


public class GapAnalysisReport extends javax.swing.JFrame {
    
    String username="guest";
    /**
     * Creates new form HomeFrame
     */
    public GapAnalysisReport(String username) {
        this.username = username;
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
 
    public GapAnalysisReport() {
       
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        pnChart.setLayout(new java.awt.BorderLayout());
       
    }
     private IntervalCategoryDataset getCategoryDataset() { 
         TaskSeries series1 = new TaskSeries("Estimated Date"); 
                 
TaskSeries series2 = new TaskSeries("Delay"); 
         if (jCourses.getSelectedIndex()==3) {
             
series2.add(new Task("ASP",  
Date.from(LocalDate.of(2020,2,17).atStartOfDay().toInstant(ZoneOffset.UTC)),  
Date.from(LocalDate.of(2020, 2,27).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
 series2.add(new Task("HTML",Date.from(LocalDate.of(2020, 2,17).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 4, 15).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        series2.add(new Task("PS",Date.from(LocalDate.of(2020, 4,25).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 5, 15).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
 series2.add(new Task("PRJ",Date.from(LocalDate.of(2020, 3,15).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 5, 21).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
   
        
 
series1.add(new Task("ASP",Date.from(LocalDate.of(2020, 2,27).atStartOfDay().toInstant(ZoneOffset.UTC)),  
Date.from(LocalDate.of(2020, 3, 15).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        series1.add(new Task("HTML",Date.from(LocalDate.of(2020, 4,15).atStartOfDay().toInstant(ZoneOffset.UTC)),  
Date.from(LocalDate.of(2020, 4, 25).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
 series1.add(new Task("PS",  
 Date.from(LocalDate.of(2020, 5, 15).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 5, 21).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
        
         }
 if (jCourses.getSelectedIndex()==4) {
             
series2.add(new Task("TERM1",  
Date.from(LocalDate.of(2020,2,17).atStartOfDay().toInstant(ZoneOffset.UTC)),  
Date.from(LocalDate.of(2020, 2,27).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
 series2.add(new Task("TERM2",Date.from(LocalDate.of(2020, 3,15).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 6, 15).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
 series2.add(new Task("TERM3",Date.from(LocalDate.of(2020, 7,1).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 9, 15).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
   
        
 
series1.add(new Task("TERM1",Date.from(LocalDate.of(2020, 2,27).atStartOfDay().toInstant(ZoneOffset.UTC)),  
Date.from(LocalDate.of(2020, 3, 15).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
 series1.add(new Task("TERM2",  
 Date.from(LocalDate.of(2020, 6, 15).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 7, 1).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
           jLabel3.setText("Course Code : NCS");
        
         }

  if (jCourses.getSelectedIndex()==0) {
        jLabel3.setText("Course Code : PGFA");
series2.add(new Task("PS",  
Date.from(LocalDate.of(2020,2,17).atStartOfDay().toInstant(ZoneOffset.UTC)),  
Date.from(LocalDate.of(2020, 3,20).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
 series2.add(new Task("PRJ",Date.from(LocalDate.of(2020, 2,17).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 3,30).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
   
        
 
series1.add(new Task("PS",Date.from(LocalDate.of(2020, 3,20).atStartOfDay().toInstant(ZoneOffset.UTC)),  
Date.from(LocalDate.of(2020, 4, 1).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
 series1.add(new Task("PRJ",  
 Date.from(LocalDate.of(2020, 3, 30).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 4, 5).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
        
         }
 if (jCourses.getSelectedIndex()==1) {
      jLabel3.setText("Course Code : PGJS");
        
 series2.add(new Task("HTML",Date.from(LocalDate.of(2020, 2,17).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 3,30).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
 series2.add(new Task("JSP",Date.from(LocalDate.of(2020, 4,1).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 5, 5).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
           
 series2.add(new Task("PS",Date.from(LocalDate.of(2020, 3,2).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 4,1).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
 series2.add(new Task("PRJ",Date.from(LocalDate.of(2020, 4,5).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 5, 15).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
   
        
 
series1.add(new Task("JAVA",Date.from(LocalDate.of(2020, 2,17).atStartOfDay().toInstant(ZoneOffset.UTC)),  
Date.from(LocalDate.of(2020, 3, 2).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
 series1.add(new Task("JSP",  
 Date.from(LocalDate.of(2020, 3, 30).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 4, 5).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
        
         }

  if (jCourses.getSelectedIndex()==2) {
                jLabel3.setText("Course Code : GNIIT");
series2.add(new Task("TERM4",  
Date.from(LocalDate.of(2020,2,17).atStartOfDay().toInstant(ZoneOffset.UTC)),  
Date.from(LocalDate.of(2020, 3,10).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
 series2.add(new Task("TERM5",Date.from(LocalDate.of(2020, 3,17).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 5,30).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
 series2.add(new Task("TERM6",Date.from(LocalDate.of(2020, 6,8).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 8, 1).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
           
 series2.add(new Task("TERM7",Date.from(LocalDate.of(2020,8,10).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 10,10).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
 
        
 
series1.add(new Task("TERM4",Date.from(LocalDate.of(2020, 3,10).atStartOfDay().toInstant(ZoneOffset.UTC)),  
Date.from(LocalDate.of(2020, 3, 17).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
 series1.add(new Task("TERM5",  
 Date.from(LocalDate.of(2020, 5, 30).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 6, 8).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
         series1.add(new Task("TERM6",  
 Date.from(LocalDate.of(2020, 8, 1).atStartOfDay().toInstant(ZoneOffset.UTC)),  
 Date.from(LocalDate.of(2020, 8, 10).atStartOfDay().toInstant(ZoneOffset.UTC))  
         ));  
        
        
         }
 TaskSeriesCollection dataset = new TaskSeriesCollection();  
 dataset.add(series1);dataset.add(series2);  
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
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
        jButton1.setBounds(740, 640, 110, 23);

        jLabel2.setText("Batch Code : ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 640, 90, 14);

        jCourses.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "B200005", "B200015", "B200025", "B200035", "B200045" }));
        jCourses.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCoursesItemStateChanged(evt);
            }
        });
        getContentPane().add(jCourses);
        jCourses.setBounds(130, 640, 100, 20);

        jLabel3.setText("Appraisal Code : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(340, 640, 210, 14);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial Unicode MS", 1, 10)); // NOI18N
        jLabel4.setText(username.toUpperCase());
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 20, 80, 20);
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 640, 0, 0);

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
        jLabel1.setBounds(0, 0, 1000, 812);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  // create dataset for pie chart
        IntervalCategoryDataset dataset = getCategoryDataset();  
      
      // Create chart  
      JFreeChart chart = ChartFactory.createGanttChart(  
            "Gap Analysis", // Chart title  
            "Phases", // X-Axis Label  
            "Timeline", // Y-Axis Label  
            dataset,true,true,true);  
  
      ChartPanel panel = new ChartPanel(chart);  
       pnChart.removeAll();        // clear panel before add new chart
        pnChart.add(panel, BorderLayout.CENTER);
        pnChart.validate();         // refresh panel to display new chart
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCoursesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCoursesItemStateChanged
        // TODO add your handling code here:
        if (jCourses.getSelectedIndex()==0) {
            jLabel5.setText("PGFAG"); jLabel5.setVisible(true);
        }
         if (jCourses.getSelectedIndex()==1) {
            jLabel5.setText("PGJS");jLabel5.setVisible(true);
        }
          if (jCourses.getSelectedIndex()==2) {
            jLabel5.setText("PG.NET");jLabel5.setVisible(true);
        }
           if (jCourses.getSelectedIndex()==3) {
            jLabel5.setText("GNIIT");jLabel5.setVisible(true);
        }
            if (jCourses.getSelectedIndex()==0) {
            jLabel5.setText("NCS");jLabel5.setVisible(true);
        }
            
    }//GEN-LAST:event_jCoursesItemStateChanged

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
 if(JOptionPane.showConfirmDialog(null, "Are you sure ?") == JOptionPane.OK_OPTION){
                    setVisible(false);
                    dispose();
                    new MainFrame(username).setVisible(true);
                }

        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(GapAnalysisReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GapAnalysisReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GapAnalysisReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GapAnalysisReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GapAnalysisReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jCourses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel pnChart;
    // End of variables declaration//GEN-END:variables
}
