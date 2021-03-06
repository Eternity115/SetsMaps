
package Conference;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;


public class ConferenceBooking extends javax.swing.JFrame {

    public Conference a,b,c,d;
    public Map<String, Conference> schedule;
    DefaultListModel list;
    Conference conf;
    
    
    public ConferenceBooking() {
        initComponents();
        /*
        try{
        FileReader f = new FileReader("Conference.txt");
        BufferedReader br = new BufferedReader(f);
            for (int i = 0; i < 12; i++) {
                String conf = br.readLine();
                String gst = br.readLine();
                System.out.println(conf + " is being attended by " + gst);
            }
            br.close();
        }catch(Exception e){
            System.out.println("File Not Found");
        } */
        a = new Conference("Android Studio Essentials", "Learn Android Studio, the lastest technology in Android App Development", "android.PNG");
        b = new Conference("Techniques in Game Development", "Industry leaders gather for a roundtable of the lastest gaming trends", "game.PNG");
        c = new Conference("Introducing HTML", "A beginning course on web development with HTML", "html.PNG");
        d = new Conference("Java Advanced Concepts", "Take your Java skills to the next level with Object Oriented fundamentals", "java.PNG");
        schedule = new HashMap<String, Conference>();
        schedule.put("Android", a);
        schedule.put("Gaming", b);
        schedule.put("HTML", c);
        schedule.put("Java", d);
        list = new DefaultListModel();
        lstguests.setModel(list);
        openFile();
        update("Android");
    }
    
    public void openFile(){
        try{
            FileReader f = new FileReader("Conference.txt");
            BufferedReader br = new BufferedReader(f);
            String key, data;
            Guest g;
            while(true){
                key=br.readLine();
                if(key==null) break;
                data = br.readLine();
                g = new Guest (data);
                //find the conference by key and signup the guest
                schedule.get(key).signup(g);
            }
            br.close();
        }catch(Exception e){
            System.out.println("File Not Found");
        }
    }
    
    public void update(String key){
        list.clear();
        conf = schedule.get(key);
        Iterator it = conf.getList().iterator();
        while(it.hasNext()){
            list.addElement(it.next());
        }
        lblname.setText(conf.getName());
        lbldesc.setText("<html>" + conf.getDescription() + "</html>");
        lblimage.setIcon(conf.getImage());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblimage = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnandroid = new javax.swing.JButton();
        btnhtml = new javax.swing.JButton();
        btnjava = new javax.swing.JButton();
        btngaming = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lbldesc = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstguests = new javax.swing.JList<>();
        btnsave = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        btnremove = new javax.swing.JButton();
        btnenroll = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimage, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblimage, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblname.setBackground(new java.awt.Color(111, 111, 111));
        lblname.setFont(new java.awt.Font("High Tower Text", 1, 14)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblname.setText("Conference Name Goes Here");
        lblname.setOpaque(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnandroid.setText("Android");
        btnandroid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnandroidActionPerformed(evt);
            }
        });

        btnhtml.setText("HTML");
        btnhtml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhtmlActionPerformed(evt);
            }
        });

        btnjava.setText("Java");
        btnjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjavaActionPerformed(evt);
            }
        });

        btngaming.setText("Gaming");
        btngaming.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btngamingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnandroid)
                .addGap(18, 18, 18)
                .addComponent(btnhtml)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnjava)
                .addGap(18, 18, 18)
                .addComponent(btngaming)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnandroid)
                    .addComponent(btnhtml)
                    .addComponent(btnjava)
                    .addComponent(btngaming))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lbldesc.setText("Description Goes Here");

        jScrollPane1.setViewportView(lstguests);

        btnsave.setText("Save & Exit");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnsave)
                    .addComponent(lbldesc, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbldesc, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnsave)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnremove.setText("Remove Guest");
        btnremove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnremoveActionPerformed(evt);
            }
        });

        btnenroll.setText("Enroll Guest");
        btnenroll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnenrollActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnenroll)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnremove)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnremove)
                    .addComponent(btnenroll))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btngamingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btngamingActionPerformed
        update("Gaming");
    }//GEN-LAST:event_btngamingActionPerformed

    private void btnjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjavaActionPerformed
        update("Java");
    }//GEN-LAST:event_btnjavaActionPerformed

    private void btnhtmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhtmlActionPerformed
        update("HTML");
    }//GEN-LAST:event_btnhtmlActionPerformed

    private void btnandroidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnandroidActionPerformed
        update("Android");
    }//GEN-LAST:event_btnandroidActionPerformed

    private void btnenrollActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnenrollActionPerformed
        GuestForm form = new GuestForm(this,true);
        form.setVisible(true);
        if(form.getSignal().equals("ok")){
            Guest g = form.getGuest();
            if(conf.signup(g)){
                list.addElement(g);
            }
            else{
                JOptionPane.showMessageDialog(this, "Guest is already enrolled");
            }
        }
    }//GEN-LAST:event_btnenrollActionPerformed

    private void btnremoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnremoveActionPerformed
        int loc = lstguests.getSelectedIndex(); //which item is selected
        if (loc==-1) return;
        if (loc==1) return;
        String info = list.getElementAt(loc).toString();
        Guest g = new Guest(info);
        conf.remove(g);
        list.removeElementAt(loc);
    }//GEN-LAST:event_btnremoveActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        FileWriter fw;
        try{
            fw = new FileWriter("Conference.txt");
            PrintWriter p = new PrintWriter(fw);
            Conference a = schedule.get("Android");
            Conference b = schedule.get("Gaming");
            Conference c = schedule.get("HTML");
            Conference d = schedule.get("Java");
            a.save(p, "Android");
            b.save(p, "Gaming");
            c.save(p, "HTML");
            d.save(p, "Java");
            p.close();
        }catch (Exception ex){
            System.out.println(ex);
        }
        JOptionPane.showMessageDialog(this, "Conference data Saved");
        System.exit(0);
    }//GEN-LAST:event_btnsaveActionPerformed

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
            java.util.logging.Logger.getLogger(ConferenceBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConferenceBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConferenceBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConferenceBooking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConferenceBooking().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnandroid;
    private javax.swing.JButton btnenroll;
    private javax.swing.JButton btngaming;
    private javax.swing.JButton btnhtml;
    private javax.swing.JButton btnjava;
    private javax.swing.JButton btnremove;
    private javax.swing.JButton btnsave;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbldesc;
    private javax.swing.JLabel lblimage;
    private javax.swing.JLabel lblname;
    private javax.swing.JList<String> lstguests;
    // End of variables declaration//GEN-END:variables
}
