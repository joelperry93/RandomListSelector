/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jListSelector;

import javax.swing.*;

import java.awt.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

import java.io.IOException;

import java.util.Arrays;



public class JavaListSelector extends javax.swing.JFrame {
    
    ArrayList<String> bufferAryList = new ArrayList<String>();
    ArrayList<String> permBufferAryList = new ArrayList<String>();
    String currentList;
    Files fls = new Files();
    //public String locationOfSaveFiles = "C:/Users/Tom/Documents/Java Projects/RandomListSelector/List Saves/";


    
    public JavaListSelector() {
        initComponents();
        myInitComponents();
    }

    /**
     * This method is called from within the constructor to initialise the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addNewListPopup = new javax.swing.JFrame();
        nameOfList = new javax.swing.JTextField();
        scrollPaneNewList = new javax.swing.JScrollPane();
        newListItems = new javax.swing.JTextArea();
        saveListBtn = new javax.swing.JButton();
        labelNameOfList = new javax.swing.JLabel();
        seeListPopup = new javax.swing.JDialog();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayList = new javax.swing.JTextArea();
        selectList = new javax.swing.JComboBox<>();
        addNewListBtn = new javax.swing.JButton();
        seeListBtn = new javax.swing.JButton();
        showRandomItemBtn = new javax.swing.JButton();
        addItemBtn = new javax.swing.JButton();

        addNewListPopup.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addNewListPopup.setLocation(new java.awt.Point(325, 255));
        addNewListPopup.setMaximumSize(new java.awt.Dimension(10000, 10000));
        addNewListPopup.setMinimumSize(null);
        addNewListPopup.setResizable(false);

        nameOfList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameOfListActionPerformed(evt);
            }
        });

        scrollPaneNewList.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        newListItems.setColumns(20);
        newListItems.setRows(5);
        newListItems.setMaximumSize(new java.awt.Dimension(200, 200));
        newListItems.setRequestFocusEnabled(false);
        scrollPaneNewList.setViewportView(newListItems);

        saveListBtn.setText("Save list");
        saveListBtn.setFocusable(false);
        saveListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveListBtnActionPerformed(evt);
            }
        });

        labelNameOfList.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelNameOfList.setText("Name of list");

        javax.swing.GroupLayout addNewListPopupLayout = new javax.swing.GroupLayout(addNewListPopup.getContentPane());
        addNewListPopup.getContentPane().setLayout(addNewListPopupLayout);
        addNewListPopupLayout.setHorizontalGroup(
            addNewListPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewListPopupLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(addNewListPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(saveListBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameOfList, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelNameOfList, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(scrollPaneNewList, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        addNewListPopupLayout.setVerticalGroup(
            addNewListPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addNewListPopupLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(addNewListPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPaneNewList, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(addNewListPopupLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(labelNameOfList)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameOfList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(saveListBtn)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        seeListPopup.setLocation(new java.awt.Point(300, 300));
        seeListPopup.setMinimumSize(new java.awt.Dimension(300, 500));
        seeListPopup.setSize(new java.awt.Dimension(150, 350));
        seeListPopup.setType(java.awt.Window.Type.POPUP);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        displayList.setEditable(false);
        displayList.setColumns(20);
        displayList.setRows(5);
        displayList.setMaximumSize(null);
        jScrollPane1.setViewportView(displayList);

        javax.swing.GroupLayout seeListPopupLayout = new javax.swing.GroupLayout(seeListPopup.getContentPane());
        seeListPopup.getContentPane().setLayout(seeListPopupLayout);
        seeListPopupLayout.setHorizontalGroup(
            seeListPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seeListPopupLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        seeListPopupLayout.setVerticalGroup(
            seeListPopupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(seeListPopupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(300, 200));

        selectList.setMaximumSize(new java.awt.Dimension(28, 20));
        selectList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectListActionPerformed(evt);
            }
        });

        addNewListBtn.setText("Add New List");
        addNewListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewListBtnActionPerformed(evt);
            }
        });

        seeListBtn.setText("See List");
        seeListBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeListBtnActionPerformed(evt);
            }
        });

        showRandomItemBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        showRandomItemBtn.setText("Show random item");
        showRandomItemBtn.setAlignmentX(600.0F);
        showRandomItemBtn.setAlignmentY(600.0F);
        showRandomItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showRandomItemBtnActionPerformed(evt);
            }
        });

        addItemBtn.setText("Add Item");
        addItemBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addItemBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(showRandomItemBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(addNewListBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(selectList, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(seeListBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addItemBtn, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addItemBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addNewListBtn)
                    .addComponent(seeListBtn))
                .addGap(18, 18, 18)
                .addComponent(showRandomItemBtn)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void myInitComponents() {
        
//        Files fls = new Files();

        //adds the list names to the combobox
        int i;
        for (i = 0; i < fls.numberOfLists(); i++) {
            String list = fls.findFiles(i);
            selectList.addItem(list);
        }
        
    }
    
    
    private void addNewListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewListBtnActionPerformed
        
        //gives focus to nameOfList input
        addNewListPopup.pack();
        nameOfList.requestFocus();
        
        //opens addNewList popup window
        addNewListPopup.setVisible(true);
        
    }//GEN-LAST:event_addNewListBtnActionPerformed

    private void nameOfListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameOfListActionPerformed

    }//GEN-LAST:event_nameOfListActionPerformed

    private void selectListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectListActionPerformed
        
        //set string as chosen list from combobox
        String chosenListName = (String)selectList.getSelectedItem();
        
        //creates new object from ReadFile class
//        Files fls = new Files();
        
        //finds the file location of the selected list
        String location = fls.fileLocation(chosenListName); 
        
        try {
            ReadFile file = new ReadFile(location);
            
            //sets the bufferAryList as the selected list
            bufferAryList = file.OpenFile();
            
            permBufferAryList = (ArrayList<String>)bufferAryList.clone();
            
            //sets currentList as the chosen list
            currentList = chosenListName;
            
        }
        catch (IOException e) {
            System.out.println( e.getMessage() );
        }
        
                
    }//GEN-LAST:event_selectListActionPerformed

    private void seeListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeListBtnActionPerformed
        
        //opens seeList popup window
        seeListPopup.setVisible(true);

        //resets list to null
        displayList.setText("");
       
        //creates iterator of the the currently selected list
        Iterator<String> listIterator = bufferAryList.iterator();
        
        //iterates through each line of selected list and adds it to the text field
        while (listIterator.hasNext()) {
            String currentItem = listIterator.next();
            displayList.append(currentItem + "\n");
        }
        
    }//GEN-LAST:event_seeListBtnActionPerformed

    private void showRandomItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showRandomItemBtnActionPerformed
        
        //finds random index from the selected list (if list is empty then -1 is returned)
        int randomIndex = randomListIndex(bufferAryList);
        
        //gets the list item equivalent to the randomIndex
        String randomItem = bufferAryList.get(randomIndex);
        
        //return int of the jPane (0 == keep, 1 == permanently remove, 2 == temporarily remove)
        int removePermOrTemp = 0;
        
        //if selected list is NOT empty
        if (randomIndex >= 0) {
            
            //array of jPane button options
            Object[] options = {"Keep item", "Permanently remove item", "Temporarily remove item"};
            
            //jOptionPane that displays the random item and gives options whether to remove item from list or to keep it
            removePermOrTemp = JOptionPane.showOptionDialog(
                null,
                randomItem,
                "Random item",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[2]);
            
        }
        //if the selected list IS empty then displays jPane to user saying so
        else if (randomIndex == -1) {
            JOptionPane.showMessageDialog(null, "Error: List Empty", "Random item", JOptionPane.PLAIN_MESSAGE);
        }
        
        
        //if user selects Permanent Remove Item button in jPane, removes the item from FILE and bufferAryList (permanent)
        if (removePermOrTemp == 1) {
            
            //first removes the line from the bufferAryList
            bufferAryList.remove(randomIndex);
            
            //finds the file location of the current list
            String fileLocation = fls.fileLocation(currentList);
            
            try {
                
                //new WriteFile item
                WriteFile overWrite = new WriteFile(fileLocation, true);
                
                //clears current file
                overWrite.clearFile();
                
                //creates clone of permBufferAryList
                ArrayList<String> tempClone = (ArrayList<String>)permBufferAryList.clone();
                
                //overwrites the file with the updated list (without the item)
                for (int i = 0; i < tempClone.size(); i++) {
                    
                    //if the items match...
                    if ( (tempClone.get(i) ).equals(randomItem) ) {
                        
                        //..then remove the item from the permBufferAryList and DON'T save the item to the file
                        permBufferAryList.remove(i);          
                    }
                    
                    //if the items DON'T match...
                    else if ( !(tempClone.get(i) ).equals(randomItem) ) {
                        
                        //..then save the line to the file
                        overWrite.writeToFile(tempClone.get(i) );
                        
                    }
                }   
            }
            catch (IOException e) {
            System.out.println( e.getMessage() );
            }
            
        }
        
        //if user selects Temporary Remove button in jPane, removes the item from just bufferAryList (NOT permanent)
        else if (removePermOrTemp == 2) {
            
            bufferAryList.remove(randomIndex);
            
            System.out.println("Buffer = " + bufferAryList + "\n\n");
            
        }
        
        
    }//GEN-LAST:event_showRandomItemBtnActionPerformed

    private void addItemBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addItemBtnActionPerformed
        
        //JOptionPane to get user-inputed new item
        String newItem = JOptionPane.showInputDialog("Add new item");
        
        //finds file location of the selected list
        String location = fls.fileLocation(currentList);

        
        try {
            
            //checks if JOptionPane was cancelled
            if (newItem != null) {
                
                //adds newItem to the bufferAryList (for immediate update)
                bufferAryList.add(newItem);
                
                WriteFile data = new WriteFile(location, true);
                
                //saves new item to the file
                data.writeToFile(newItem);
            }
        }
        catch (IOException e) {
            System.out.println( e.getMessage() );
        }        
        
    }//GEN-LAST:event_addItemBtnActionPerformed

    private void saveListBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveListBtnActionPerformed
        
        //stores the user inputed name of list and clears text area
        String newListName = nameOfList.getText();
        nameOfList.setText("");
        
        //creates the file location using the name of list
        String newListFileName = fls.locationOfSaveFiles + "/" + newListName + ".txt";
        
        
        //creates a string from the user inputed list of new items and clears text area
        String stringListOfItems = newListItems.getText();
        newListItems.setText("");
        
        //creates ArrayList from the string of newListItems. (new item at each new line)
        ArrayList aryListOfNewItems = new ArrayList(Arrays.asList(stringListOfItems.split("\n")));
        
        //set the bufferAryList to the new ArrayList
        bufferAryList = aryListOfNewItems;
        
        
        // loops through ArrayList items and saves them to a newly created file
        try {
            WriteFile data = new WriteFile(newListFileName, true);
            int i;
            for (i = 0; i < aryListOfNewItems.size(); i++) {
                String lineOfArray = String.valueOf(aryListOfNewItems.get(i));
                data.writeToFile(lineOfArray);
            }
        }
        catch (IOException e) {
            System.out.println( e.getMessage() );
        }
        
        //adds new list to the combobox and selects it
        selectList.addItem(newListName);
        selectList.setSelectedItem(newListName);
        
        
        //closes the addNewList popup window
        addNewListPopup.setVisible(false);
        
    }//GEN-LAST:event_saveListBtnActionPerformed


    
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
            java.util.logging.Logger.getLogger(JavaListSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JavaListSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JavaListSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JavaListSelector.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JavaListSelector().setVisible(true);
            }
        });

    }    


    //returns random a random index from an ArrayList and returns -1 if ArrayList is empty
    int randomListIndex(ArrayList list) {
        
        Random randomIndex = new Random();
        
        int sizeOfList = list.size();
        if(sizeOfList > 0) {
            int index = randomIndex.nextInt(sizeOfList);
            return index;
        }
        else {
            return -1;
        }
        
    }
    
    
    
    class MyComboBoxRenderer extends JLabel implements ListCellRenderer {
        private String _title;

        public MyComboBoxRenderer(String title)
        {
            _title = title;
        }

        @Override
        public Component getListCellRendererComponent(JList list, Object value,
                int index, boolean isSelected, boolean hasFocus)
        {
            if (index == -1 && value == null) setText(_title);
            else setText(value.toString());
            return this;
        }
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addItemBtn;
    private javax.swing.JButton addNewListBtn;
    private javax.swing.JFrame addNewListPopup;
    private javax.swing.JTextArea displayList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelNameOfList;
    private javax.swing.JTextField nameOfList;
    private javax.swing.JTextArea newListItems;
    private javax.swing.JButton saveListBtn;
    private javax.swing.JScrollPane scrollPaneNewList;
    private javax.swing.JButton seeListBtn;
    private javax.swing.JDialog seeListPopup;
    private javax.swing.JComboBox<String> selectList;
    private javax.swing.JButton showRandomItemBtn;
    // End of variables declaration//GEN-END:variables
}
