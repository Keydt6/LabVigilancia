/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import java.awt.event.*;
import Vista.VContrato;
import Modelo.Listas;
import Modelo.MContrato;
import Modelo.MMontoServicio;
import Modelo.MServicio;
import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Jesus
 */
public class CContrato implements ActionListener{

    private VContrato vc = new VContrato();
    private Listas li;
    private MMontoServicio mms;
    private MServicio ms;
    
    public CContrato(Listas li) {
        mms = new MMontoServicio();
        this.li=li;
        vc.setVisible(true);
        vc.setLocationRelativeTo(null);
        vc.AgregarListener(this);

    }
    
    public void actionPerformed (ActionEvent evt){
        if(evt.getSource().equals(vc.getBtnBuscar())) {
            ClienteBuscado();
        }
        
        if(evt.getSource().equals(vc.getBtnCrearContrato())) {
           CrearContrato();
           AsignarTurnos();
           //JOptionPane.showMessageDialog(null, "Exito");
             
        }
    }
    
    public int BuscarCliente() {
        String co = vc.getTxtCliente().getText();
        int pos=0;
        int i=-1;
        String r;
        while(pos<li.getListaCliente().size()) {
            r =li.getListaCliente().get(pos).getIdCliente();
            if(co.equals(r)) {
                i=pos;
            }
            pos++;
        }
        return i;
    }
    
    public void CrearContrato() {
        int vi;
        int bi;
        int ra;
        
        vi=(int) vc.getSpnVigilantes().getValue();
        if(vc.getJcbBicicletas().isEnabled() && vc.getJcbBicicletas().isSelected()) 
            bi=(int) vc.getSpnBicicletas().getValue();
        else
            bi=0;
        if(vc.getJcbRadios().isEnabled() && vc.getJcbRadios().isSelected())
                ra=(int) vc.getSpnRadios().getValue();
        else
            ra=0;
        String id = Integer.toString(li.getListaContratos().size()+1);   
        
        //Fecha Actual
        Calendar fecha = Calendar.getInstance();
        Date fechaActual = new Date();
        fechaActual = fecha.getTime();
        String fechaFormato = new SimpleDateFormat("dd-MM-yyyy").format(fechaActual);
        
        //Se crea un objeto MCONTRATO con datos de prueba
        MContrato mc = new MContrato(id,
                                    vc.getTxtCliente().getText(),
                                    vc.getCmbTipo().getSelectedIndex(),
                                    vi,
                                    bi,
                                    ra,
                                    fechaFormato,
                                    NroDias());
        //Se calculan las horas y el monto total a pagar
        mc.CalcularHoras();
        double monto = mc.CalcularMonto(mms);
        mc.setMontoAPagar(monto);
        //Añadimos el contrato la Lista de Contratos
        li.getListaContratos().add(mc);
    }
    
   public int NroDias() {
       
       //Fecha Actual
       Calendar fecha = Calendar.getInstance();
       Date fechaActual = new Date();
       int fechaActual2 = fecha.get(Calendar.DATE);
       fecha.set(fecha.get(Calendar.YEAR), fecha.get(Calendar.MONTH), fecha.get(Calendar.DATE));
       //Ultima Fecha del Mes
       int ultimoDiaMes=fecha.getActualMaximum(Calendar.DAY_OF_MONTH);
       int nroDias=ultimoDiaMes-fechaActual2;
       return nroDias;
       
   }
   
   public void ClienteBuscado() {
       if(BuscarCliente()==-1) {
           JOptionPane.showMessageDialog(null, "Usuario No encontrado");
       } else {
           vc.getCmbTipo().setSelectedIndex(li.getListaCliente().get(BuscarCliente()).getIdTipo());
           if (vc.getCmbTipo().getSelectedIndex() == 1) {
               vc.getJcbBicicletas().setEnabled(true);
               vc.getJcbRadios().setEnabled(true);
           }
           if(vc.getCmbTipo().getSelectedIndex()== 2) {
               vc.getJcbBicicletas().setEnabled(false);
               vc.getJcbRadios().setEnabled(true);
           }
           if(vc.getCmbTipo().getSelectedIndex()== 3) {
               vc.getJcbBicicletas().setEnabled(false);
               vc.getJcbRadios().setEnabled(false);
           }           
       }
}
   
   public void AsignarTurnos() {
       
       int nroVi=(int) vc.getSpnVigilantes().getValue();  //Numero de Vigilantes
       boolean n=true;     
       int nt=1;           //Numero de turnos
       boolean a=true;     //Si a es True es porque son dos turnos. Si no, es uno solo.
       if(vc.getCmbTipo().getSelectedIndex() == 1 || vc.getCmbTipo().getSelectedIndex() == 2)
           nt = 2;
       else {
           nt=1;
           a=false;
       }
       
       //Informacion para llenar el Servicio
       String id=Integer.toString(li.getListaContratos().size());
       double montoBici = li.getListaContratos().get(li.getListaContratos().size()-1).getNroBicis()*mms.getMontoBici();
       double montoRadio = li.getListaContratos().get(li.getListaContratos().size()-1).getNroRadios()*mms.getMontoRadio();
       double montoVigilante = (7*mms.getMontoHora()+5*mms.horaExtra())*nroVi;
       
       //variable de disponibilidad
       boolean dis=true;
       //Vigilante aleatorio
       Random rmd = new Random();
       int num=li.getListaVigilante().size();
       boolean v=true;  //Booleano para cambiar de vigilante
       
       //Fecha Actual
       Calendar fecha = Calendar.getInstance();
       Date fechaActual = new Date();
       fechaActual = fecha.getTime();
       //Ciclo asignar turnos por dia
       for(int i=0; i<NroDias()*nt; i++) {
           
           if(a) {
                if(n)
                fecha.add(Calendar.DAY_OF_MONTH, 1);
           } else {
                fecha.add(Calendar.DAY_OF_MONTH, 1);
           }
            fechaActual=fecha.getTime();
            
            String fechaFormato;
            fechaFormato = new SimpleDateFormat("dd-MM-yyyy").format(fechaActual);
            ms = new MServicio(id,
                                vc.getTxtCliente().getText(),
                                "idturno",
                                 fechaFormato,
                                montoVigilante,  //montovigilantes
                                montoBici,       //montobicis
                                montoRadio);     //montoradios
           
           for(int t=0; t<nroVi; t++) {
            v=true;
            while(v) {
                 //Elegimos el Vigilante al azar
                 int vigi = rmd.nextInt(num);
                 String coVigi = li.getListaVigilante().get(vigi).getIdVigilante();
                 if(VerificarDisponibilidad(fechaActual,coVigi)) {
                     //Asignamos al vigilante
                     ms.getIdVigilantes().add(coVigi);

                     v=false;
                 } else {
                     v=true;
                 }
            }
            }
              if(a) {
                if(n)
                    n=false;
                else
                    n=true;
       }
       li.getListaServicios().add(ms);
       }
           
   }
   
   
     public boolean VerificarDisponibilidad(Date fecha, String codVigi) {
       boolean dis=true;
       boolean e=false; //Encontrado o no encontrado el servicio
       boolean f=false; //Encontrado o no encontrado el vigilante
       int c=0; //Contador para primer bucle
       int d=0; //contador para segundo bucle
       int a=0; //contador para el bluce del arreglo interno
       int pos1=0;
       int pos2=0;
       String fechaFormato;
       fechaFormato = new SimpleDateFormat("dd-MM-yyyy").format(fecha);
       
       //Buscamos en el Arreglo local
                      while(a<ms.getIdVigilantes().size() && f==false) {
                   if(codVigi.equals(ms.getIdVigilantes().get(a))) {
                       f=true;
                       dis=false;
                   }
                   a++;
               }
       
       //Buscamos en la lista de Servicios
       if(li.getListaServicios()!=null) {
       while(c<li.getListaServicios().size() && e==false) {
           if(fechaFormato.equals(li.getListaServicios().get(c).getFecha())) {
               e=true;
               pos1=c;
               //Buscamos en el Array de Vigilandes de ese Servicio
               while(d<li.getListaServicios().get(pos1).getIdVigilantes().size() && f==false) {
                   if(codVigi.equals(li.getListaServicios().get(c).getIdVigilantes().get(d))) {
                       f=true;
                       dis=false;
                   }
                   d++;
               }
           }
           c++;
       }
       }
       return dis;    
     }
   
}



