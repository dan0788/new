package pico_y_placa;
import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.Image;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class picoyplaca extends javax.swing.JFrame {
String fecha,day,n1;
int dia,mes,año,hora,min,seg;
char c;
boolean z;
    public picoyplaca() throws IOException{
        initComponents();
        RestrictedTextField restricted = new RestrictedTextField(num_placa);
        restricted.setLimit(7);
        n1=jOptionPane1.showInputDialog(null,"Ingrese la placa del auto","Ingreso",JOptionPane.INFORMATION_MESSAGE);
        num_placa.setText(n1.toUpperCase());
        fecha();
        setTitle("Menú");
        setLocationRelativeTo(null);
        ImageIcon foto=new ImageIcon(this.getClass().getResource("/pico_y_placa/YBl_ySP7.jpg"));
        Icon icono=new ImageIcon(foto.getImage().getScaledInstance(jLabel3.getWidth(),jLabel3.getHeight(),Image.SCALE_DEFAULT));
        jLabel3.setIcon(icono);
        this.repaint();
    }
    public void permiso(int h,int m,String d){
        if((h==7&&(m>=0&&m<60))||(h==9&&(m<=30&&m>=0))||(h==8&&(m>=0&&m<60))||(h==16&&(m>=0&&m<60))||(h==17&&(m>=0&&m<60))
                ||(h==18&&(m>=0&&m<60))||(h==19&&(m>=0&&m<=30))){            
                switch(c){
                    case '1':
                        if(day.equals("Lunes")){
                            circular.setText("Su auto no puede circular en este momento por la ciudad de Quito");
                        }else{
                            circular.setText("Su auto puede circular libremente por la ciudad de Quito");
                        }
                        break;
                    case '2':
                        if(day.equals("Lunes")){
                            circular.setText("Su auto no puede circular en este momento por la ciudad de Quito");
                        }else{
                            circular.setText("Su auto puede circular libremente por la ciudad de Quito");
                        }
                        break;
                    case '3':
                        if(day.equals("Martes")){
                            circular.setText("Su auto no puede circular en este momento por la ciudad de Quito");
                        }else{
                            circular.setText("Su auto puede circular libremente por la ciudad de Quito");
                        }
                        break;
                    case '4':
                        if(day.equals("Martes")){
                            circular.setText("Su auto no puede circular en este momento por la ciudad de Quito");
                        }else{
                            circular.setText("Su auto puede circular libremente por la ciudad de Quito");
                        }
                        break;
                    case '5':
                        if(day.equals("Miércoles")){
                            circular.setText("Su auto no puede circular en este momento por la ciudad de Quito");
                        }else{
                            circular.setText("Su auto puede circular libremente por la ciudad de Quito");
                        }
                        break;
                    case '6':
                        if(day.equals("Miércoles")){
                            circular.setText("Su auto no puede circular en este momento por la ciudad de Quito");
                        }else{
                            circular.setText("Su auto puede circular libremente por la ciudad de Quito");
                        }
                        break;
                    case '7':
                        if(day.equals("Jueves")){
                            circular.setText("Su auto no puede circular en este momento por la ciudad de Quito");
                        }else{
                            circular.setText("Su auto puede circular libremente por la ciudad de Quito");
                        }
                        break;
                    case '8':
                        if(day.equals("Jueves")){
                            circular.setText("Su auto no puede circular en este momento por la ciudad de Quito");
                        }else{
                            circular.setText("Su auto puede circular libremente por la ciudad de Quito");
                        }
                        break;
                    case '9':
                        if(day.equals("Viernes")){
                            circular.setText("Su auto no puede circular en este momento por la ciudad de Quito");
                        }else{
                            circular.setText("Su auto puede circular libremente por la ciudad de Quito");
                        }
                        break;
                    case '0':
                        if(day.equals("Viernes")){
                            circular.setText("Su auto no puede circular en este momento por la ciudad de Quito");
                        }else{
                            circular.setText("Su auto puede circular libremente por la ciudad de Quito");
                        }
                        break;
                }
            }else{
            circular.setText("No tiene ninguna restricción de pico y placa");
        }
        }    
    public void obtener_dia(int dia, int mes, int año)throws IOException{
        InputStreamReader isr = new InputStreamReader (System.in);
        BufferedReader br = new BufferedReader (isr);

        int año1,semana,x,y,z,total,u,j;        
        semana=0;
        {
        if((año / 100)%4 == 1)  x = semana + 5;
            else if ((año/100)%4==2)  x= semana+3;
                   else if ((año/100)%4==3) x = semana+1;
                          else if ((año/100)%4==0) x = semana+0;
                               
        else x=0;
         j=0;
            z = 0;
        año1=(año%100)+((año%100)/4);
        y=0;

                if (año % 400 == 0 && año % 100 != 0 && año % 4 == 0)
            if (mes==1 || mes==2) j=z-1;
                else j=z+0;

             if (mes == 8)u = y + 1;
        else if(mes == 2 || mes == 3 || mes == 11) u = y + 2;
        else if(mes == 6) u = y + 3;
        else if(mes == 9 || mes == 12 ) u = y + 4;
        else if(mes == 4 || mes == 7 ) u = y + 5;
        else if(mes == 1 || mes == 10 ) u = y + 6;
        else u = y + 0;

        total=x+y+z+año1+u+dia+j;

        if (total%7==1) day="Lunes";
            else if(total % 7 == 2) day="Martes";
            else if(total % 7 == 3) day="Miércoles";
            else if(total % 7 == 4) day="Jueves";
            else if(total % 7 == 5) day="Viernes";
            else if(total % 7 == 6) day="Sabado";
            else day="Domingo";
    }
    }
    public void recibir_placa(String n){        
        try{                       
             c=n.charAt(6);
             datos.setText(c+"");
            if(c<'0'||c>'9'){
                jOptionPane1.showMessageDialog(null, "Mal ingreso de datos","Error",JOptionPane.ERROR_MESSAGE);
            }else{
                datos.setText(c+"");
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "El número ingresado es incorrecto");
        }  
    }    
    public void fecha()throws IOException{
        Calendar Cal= Calendar.getInstance();
        dia=Cal.get(Cal.DATE);
        mes=Cal.get(Cal.MONTH)+1;
        año=Cal.get(Cal.YEAR);
        hora=Cal.get(Cal.HOUR_OF_DAY);
        min=Cal.get(Cal.MINUTE);
        seg=Cal.get(Cal.SECOND);        
            obtener_dia(dia,mes,año);
            String fec= day+"    "+dia+"d/"+mes+"m/"+año+"a  "+hora+"h:"+min+"min:"+seg+"seg";
            fecha_obj.setText(fec);
    }
    public void error(int dia,int mes,int año,int hora,int min,int seg){
        if(((dia<1||dia>31)&&(mes==1||mes==3||mes==5||mes==7||mes==8||mes==10||mes==12))||((dia<1||dia>30)&&(mes==4||mes==6||mes==9||mes==11))
                ||((dia<1||dia>29)&&(mes==2)&&((año % 4 == 0) && ((año % 100 != 0) || (año % 400 == 0))))||
                ((dia<1||dia>28)&&(mes==2)&&((año % 4 != 0) && ((año % 100 == 0) || (año % 400 != 0))))||
                (hora<0||hora>24)||(min<0||min>=60)||(seg<0||seg>=60)||(mes<=0||mes>12)){
            z=true;
            jOptionPane1.showMessageDialog(null,"No puede pasarse del límite de fecha y/o hora \n Ingrese otra vez los datos","Error",JOptionPane.ERROR_MESSAGE);
        }else if ((dia>1&&dia<31)&&(mes>0&&mes<12)&&(hora>=0&&hora<24)&&(min>0&&min<60)&&(seg>0&&seg<60)){
            z=false;
            jOptionPane1.showMessageDialog(null,"Ingreso correcto","Correcto",JOptionPane.INFORMATION_MESSAGE);
        }
        
    }
    public void ingresar_fecha() throws IOException{
        
        dia=Integer.parseInt(jOptionPane1.showInputDialog(null,"Ingrese el día(en números)"));   
        mes=Integer.parseInt(jOptionPane1.showInputDialog(null,"Ingrese el mes(en números)"));
        año=Integer.parseInt(jOptionPane1.showInputDialog(null,"Ingrese el año"));
        hora=Integer.parseInt(jOptionPane1.showInputDialog(null,"Ingrese la hora"));
        min=Integer.parseInt(jOptionPane1.showInputDialog(null,"Ingrese el/los minuto/s"));
        seg=Integer.parseInt(jOptionPane1.showInputDialog(null,"Ingrese los segundos"));
       
        error(dia,mes,año,hora,min,seg);
        if(z==true){
            jOptionPane1.showMessageDialog(null,"Ingreso erróneo \n Ingrese de nuevo","Error",JOptionPane.ERROR_MESSAGE);
        }else{
            obtener_dia(dia,mes,año);
        String fec= day+"    "+dia+"d/"+mes+"m/"+año+"a  "
                    +hora+"h:"+min+"min:"+seg+"seg";
            fecha_obj.setText(fec);
        }
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        num_placa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fecha_obj = new javax.swing.JTextField();
        cambiar_fecha = new javax.swing.JButton();
        datos = new javax.swing.JTextField();
        registrar = new javax.swing.JButton();
        circular = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cambiar_placa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jTextField1.setText("PICO Y PLACA");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, -1, -1));

        jLabel1.setText("DATO DE PLACA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        num_placa.setEditable(false);
        getContentPane().add(num_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 290, -1));

        jLabel2.setText("FECHA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        fecha_obj.setEditable(false);
        getContentPane().add(fecha_obj, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 290, -1));

        cambiar_fecha.setText("Cambiar fecha y hora");
        cambiar_fecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiar_fechaActionPerformed(evt);
            }
        });
        getContentPane().add(cambiar_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, -1, -1));

        datos.setEditable(false);
        getContentPane().add(datos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 260, 90, -1));

        registrar.setText("Mostrar datos");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });
        getContentPane().add(registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 210, -1, -1));

        circular.setEditable(false);
        getContentPane().add(circular, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 300, 530, -1));
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 590));

        cambiar_placa.setText("Cambiar N° de placa");
        cambiar_placa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiar_placaActionPerformed(evt);
            }
        });
        getContentPane().add(cambiar_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        recibir_placa(n1);
        circular.setText("");
        permiso(hora,min,day);
    
    }//GEN-LAST:event_registrarActionPerformed

    private void cambiar_fechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiar_fechaActionPerformed
        fecha_obj.setText("");
        try{
            ingresar_fecha();
        }catch(IOException e){
            System.out.println(e);
        }
    }//GEN-LAST:event_cambiar_fechaActionPerformed

    private void cambiar_placaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiar_placaActionPerformed
        n1=jOptionPane1.showInputDialog(null,"Ingrese la placa del auto","Ingreso",JOptionPane.INFORMATION_MESSAGE);
        num_placa.setText(n1.toUpperCase());
    }//GEN-LAST:event_cambiar_placaActionPerformed

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
            java.util.logging.Logger.getLogger(picoyplaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(picoyplaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(picoyplaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(picoyplaca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new picoyplaca().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(picoyplaca.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cambiar_fecha;
    private javax.swing.JButton cambiar_placa;
    private javax.swing.JTextField circular;
    private javax.swing.JTextField datos;
    private javax.swing.JTextField fecha_obj;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTextField num_placa;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
