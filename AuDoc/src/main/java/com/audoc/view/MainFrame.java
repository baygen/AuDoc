package com.audoc.view;


import com.audoc.model.datetime.DateTimeAPI;
import com.audoc.model.entity.Seanses;
import com.audoc.view.moduls.SeanseTableModel;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
 
/**
 *
 * @author Buy
 */
public class MainFrame extends JFrame {

    private static final long serialVersionUID = 1L;

    private final SeanseTableModel seanseTableModel;    


    public MainFrame() {
//        this.dateClass= dates;
        seanseTableModel = new SeanseTableModel();
//        firstTableDay = DateTimeAPI.STRING_DATE_FIRST_TABLE;
//        nextTableDay = DateTimeAPI.STRING_DATE_SECOND_TABLE;
        initComponents();
        runningClock();
//        displayDataToTables();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelUp = new javax.swing.JPanel();
        labelClock = new javax.swing.JLabel();
        forTableMainPanel = new javax.swing.JPanel();
        panelTodayTable = new javax.swing.JPanel();
        labelTodayDate = new javax.swing.JLabel();
        jScrollPaneToday = new javax.swing.JScrollPane();
        jTableToday = new javax.swing.JTable();
        panelTomorrowTable = new javax.swing.JPanel();
        jScrollPaneTomorrow = new javax.swing.JScrollPane();
        jTableNextDay = new javax.swing.JTable();
        labelNextDate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanelNewSeanse = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tfPacFamily = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        jButNewPacient = new javax.swing.JButton();
        jComboTime = new javax.swing.JComboBox<>();
        labResult = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        RemoveChoosen = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelUp.setBackground(new java.awt.Color(245, 245, 245));
        panelUp.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));
        panelUp.setToolTipText("");

        labelClock.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N

        javax.swing.GroupLayout panelUpLayout = new javax.swing.GroupLayout(panelUp);
        panelUp.setLayout(panelUpLayout);
        panelUpLayout.setHorizontalGroup(
            panelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUpLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelClock, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        panelUpLayout.setVerticalGroup(
            panelUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelUpLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelClock, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );

        forTableMainPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));

        panelTodayTable.setBackground(new java.awt.Color(204, 204, 204));
        panelTodayTable.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        labelTodayDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelTodayDate.setText(DateTimeAPI.STRING_DATE_FIRST_TABLE);

        jTableToday.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableToday.setModel(seanseTableModel.getModel(DateTimeAPI.STRING_DATE_FIRST_TABLE));
        jTableToday.setAlignmentX(2.0F);
        jTableToday.setAlignmentY(2.0F);
        jTableToday.setAutoscrolls(false);
        jTableToday.setRowHeight(21);
        jTableToday.setSelectionBackground(new java.awt.Color(153, 153, 153));
        jTableToday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableTodayMousePressed(evt);
            }
        });
        jScrollPaneToday.setViewportView(jTableToday);

        javax.swing.GroupLayout panelTodayTableLayout = new javax.swing.GroupLayout(panelTodayTable);
        panelTodayTable.setLayout(panelTodayTableLayout);
        panelTodayTableLayout.setHorizontalGroup(
            panelTodayTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneToday, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 466, Short.MAX_VALUE)
            .addGroup(panelTodayTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTodayDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTodayTableLayout.setVerticalGroup(
            panelTodayTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTodayTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelTodayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneToday, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
        );

        panelTomorrowTable.setBackground(new java.awt.Color(204, 204, 204));
        panelTomorrowTable.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.white, java.awt.Color.lightGray));

        jTableNextDay.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTableNextDay.setModel(seanseTableModel.getModel(DateTimeAPI.STRING_DATE_SECOND_TABLE)

        );
        jTableNextDay.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableNextDay.setRowHeight(21);
        jTableNextDay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableNextDayMousePressed(evt);
            }
        });
        jScrollPaneTomorrow.setViewportView(jTableNextDay);

        labelNextDate.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelNextDate.setText(DateTimeAPI.STRING_DATE_SECOND_TABLE);

        javax.swing.GroupLayout panelTomorrowTableLayout = new javax.swing.GroupLayout(panelTomorrowTable);
        panelTomorrowTable.setLayout(panelTomorrowTableLayout);
        panelTomorrowTableLayout.setHorizontalGroup(
            panelTomorrowTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPaneTomorrow)
            .addGroup(panelTomorrowTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelNextDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelTomorrowTableLayout.setVerticalGroup(
            panelTomorrowTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTomorrowTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelNextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneTomorrow, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 376, Short.MAX_VALUE)
        );

        jPanelNewSeanse.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Фамілія та ім'я:");

        tfPacFamily.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfPacFamily.setPreferredSize(new java.awt.Dimension(8, 23));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Номер телефону:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Дата прийому:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Виберіть годину:");

        tfPhone.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButNewPacient.setText("Add seanse");
        jButNewPacient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButNewPacientActionPerformed(evt);
            }
        });

        jComboTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "10:40", "11:20", "12:00", "12:40","13:20","14:40","15:20","16:00","16:40","17:20" }));

        labResult.setText("Prymitka:");

        //labResult.setText(jDateChooser1.getDateFormatString());
        jDateChooser1.setDateFormatString("dd-MM-yyyy");
        jDateChooser1.setDebugGraphicsOptions(javax.swing.DebugGraphics.BUFFERED_OPTION);

        RemoveChoosen.setText("Remove Choosen");

        javax.swing.GroupLayout jPanelNewSeanseLayout = new javax.swing.GroupLayout(jPanelNewSeanse);
        jPanelNewSeanse.setLayout(jPanelNewSeanseLayout);
        jPanelNewSeanseLayout.setHorizontalGroup(
            jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewSeanseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labResult, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelNewSeanseLayout.createSequentialGroup()
                        .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfPhone)
                            .addComponent(tfPacFamily, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(jComboTime, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelNewSeanseLayout.createSequentialGroup()
                        .addComponent(jButNewPacient)
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(RemoveChoosen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelNewSeanseLayout.setVerticalGroup(
            jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNewSeanseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButNewPacient)
                    .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tfPacFamily, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanelNewSeanseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labResult, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(RemoveChoosen))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout forTableMainPanelLayout = new javax.swing.GroupLayout(forTableMainPanel);
        forTableMainPanel.setLayout(forTableMainPanelLayout);
        forTableMainPanelLayout.setHorizontalGroup(
            forTableMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forTableMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(forTableMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelNewSeanse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(forTableMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTodayTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTomorrowTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(184, Short.MAX_VALUE))
        );
        forTableMainPanelLayout.setVerticalGroup(
            forTableMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(forTableMainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(forTableMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTodayTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelNewSeanse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(forTableMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelTomorrowTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.white, java.awt.Color.lightGray));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forTableMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelUp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(forTableMainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jButNewPacientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButNewPacientActionPerformed
        
//       Thread thread = new Thread("Saving seanses to DB"){
//            
//            @Override
//            public void run(){
////                long start=LocalTime.now().toNanoOfDay();
//                Seanses seans = getSeanseFromGUI();
//                if(seans.getSeansesTime().before(Calendar.getInstance())){
//                    JOptionPane.showMessageDialog(null, "Can't do this operation");
//                }else{
//                    try{
//                        hibUtil.addSeanse(seans,updatedDate);
//                        String seansesDate=seans.getSeansesTime().toDateString();
////                        long end=LocalTime.now().toNanoOfDay();
//                        if(seansesDate.equals(firstTableDay)){
//                               setSeanseFromDatabaseToTable(getStartSeanseDay(), jTableToday);
//                           }else if(seansesDate.equals(nextTableDay)){
//                               setSeanseFromDatabaseToTable(getNextTableDate(), jTableNextDay);
//                           }
//                        JOptionPane.showMessageDialog(null, "Seanse is created");
////                        System.out.println((end-start)+"run() in thread before dialog");
//                    }catch(HibernateException e){
//                    }
//                }
////                long end=LocalTime.now().toNanoOfDay();
////                System.out.println((end-start)+"run() in thread at btnNewPacient(()");
//            }
//       };
//       thread.start();
//      
    }//GEN-LAST:event_jButNewPacientActionPerformed

    /**
     *
     * @return timestamp to be deleted from data storage
     */
    public Timestamp getTimesatampToDelete(){
        Timestamp stamp=null;
        int choosenIndex=0;
        DefaultTableModel dtm= null;
            if(jTableToday.getSelectedRow()!=-1){
                dtm=(DefaultTableModel)jTableToday.getModel();
                choosenIndex=jTableToday.getSelectedRow();
                    
            }else if(jTableNextDay.getSelectedRow()!=-1){
                dtm=(DefaultTableModel)jTableNextDay.getModel();
                choosenIndex=jTableNextDay.getSelectedRow();
            }
            if(dtm!=null){
                
                stamp=DateTimeAPI.getTimestampOf(dtm.getColumnName(0)
                               ,""+dtm.getValueAt(choosenIndex, 0));
                    
                dtm.setValueAt(null, choosenIndex, 1);
                dtm.setValueAt(null, choosenIndex, 2);
                dtm.setValueAt(null, choosenIndex, 3);
            }
        return stamp;
    }
    
    public JButton getButtonRemove(){
        return RemoveChoosen;
    }
    
    public JButton getButtonAddSeanses(){
        return  jButNewPacient;
    }
    
    private void jTableTodayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTodayMousePressed
        if(jTableNextDay.getSelectedRows().length>0){
            jTableNextDay.clearSelection();
        }
    }//GEN-LAST:event_jTableTodayMousePressed

    private void jTableNextDayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableNextDayMousePressed
        
        if(jTableToday.getSelectedRows().length>0){
            jTableToday.clearSelection();
        }
    }//GEN-LAST:event_jTableNextDayMousePressed

//    @SuppressWarnings("unchecked")
    public void setDataToTable(List<Seanses> data){
               
        if(!data.isEmpty()){ 

            data.forEach((Seanses s) -> {
                    
                LocalDate sdate= s.getSeansesTime().toLocalDateTime().toLocalDate();
                DefaultTableModel dtm =null;
                    
                if(sdate.isEqual(DateTimeAPI.DATE_FIRST_TABLE)){
                    dtm=(DefaultTableModel)jTableToday.getModel();
                }else if(sdate.isEqual(DateTimeAPI.DATE_SECOND_TABLE)){
                    dtm=(DefaultTableModel)jTableNextDay.getModel();
                }
                    
                    try{
                            for(int i = 0;i<dtm.getRowCount();i++){
                                String tableTime = (String)dtm.getValueAt(i, 0);

                                    if(tableTime.equals(s.getTime())){

                                    dtm.setValueAt(s.getPacientName(), i, 1);
                                    dtm.setValueAt(s.getPacientPhone(), i, 2);
                                    String isFirstTime = (s.getIsFirstTime())?"Вперше":null;
                                    dtm.setValueAt(isFirstTime, i, 3);
                                }
                            }
                        
                        }catch(NullPointerException e){
                        JOptionPane.showMessageDialog(null, "For two nearest seanses dates no pacients");
                        }
                    
                });
            }
        
    }
    
    private void runningClock() {
        
        Thread thr = new Thread("clock"){
            private LocalTime getCurTime;
            
            @Override
            public void run(){
                for(;;){
                    getCurTime = LocalTime.now();
                    int minute =getCurTime.getMinute();
                    int seconds = getCurTime.getSecond();
                    String mins =""+minute;
                    String sec = ""+seconds;
                        if(minute<10){
                            mins = "0"+minute;
                        }
                        if(seconds<10){
                            sec = "0"+seconds;
                        }
                    labelClock.setText(getCurTime.getHour()+":"+mins+":"+sec);  

                }
            }   
        };
        thr.start();
    }

    public static MainFrame startFrame() {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        /* Create and display the form */
        MainFrame frame= new MainFrame();
        java.awt.EventQueue.invokeLater(() -> {
            frame.setVisible(true);
        });
        
        return frame;
    }
    
    public Seanses getSeanseFromGUI() throws NullPointerException, Exception {
        Seanses seanse=null;
        String pacName=tfPacFamily.getText();
        Date date = jDateChooser1.getDate();
        
        if(!pacName.trim().equals("")&& date!=null){
            
            Timestamp stamp = DateTimeAPI.getTimestampOf(jDateChooser1.getDate(),
                                            jComboTime.getSelectedItem()+"");
            
            if((stamp.toLocalDateTime()).isAfter(LocalDateTime.now())){
                
                seanse = new Seanses(stamp, tfPacFamily.getText());
                
                    try{
                        int number= Integer.valueOf(tfPhone.getText());
                        seanse.setPacientPhone(number+"");
                    }catch(NumberFormatException e){
                        JOptionPane.showMessageDialog(null, "Wrong phone number."
                                + "Must be only numbers!");
                    }
                
            }else{
             JOptionPane.showMessageDialog(null, "Can't save seanse for days before today!");
             throw new Exception("Date for save before today");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Field can't be empty");   
            throw new NullPointerException("Seanse is null");            
        }
        return seanse;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton RemoveChoosen;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JPanel forTableMainPanel;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButNewPacient;
    private javax.swing.JComboBox<String> jComboTime;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelNewSeanse;
    private javax.swing.JScrollPane jScrollPaneToday;
    private javax.swing.JScrollPane jScrollPaneTomorrow;
    private javax.swing.JTable jTableNextDay;
    private javax.swing.JTable jTableToday;
    private javax.swing.JLabel labResult;
    private javax.swing.JLabel labelClock;
    private javax.swing.JLabel labelNextDate;
    private javax.swing.JLabel labelTodayDate;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JPanel panelTodayTable;
    private javax.swing.JPanel panelTomorrowTable;
    private javax.swing.JPanel panelUp;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextField tfPacFamily;
    private javax.swing.JTextField tfPhone;
    // End of variables declaration//GEN-END:variables

    
}
