package spr.hib.dao;

import hib.beans.Admin;
import hib.beans.CanteenOperator;
import hib.beans.CanteenOperatorLogin;
import hib.beans.DigitalCanteen;
import hib.beans.DigitalPharmacy;
import hib.beans.Doctor;
import hib.beans.Nurse;
import hib.beans.Patient;
import hib.beans.PharmacyOperatorLogin;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;

public class LogicalCodeDAO 
{
    private HibernateTemplate template;
    public HibernateTemplate getTemplate(HibernateTemplate template){
        return template;
    }

    public void setTemplate(HibernateTemplate template) {
        this.template = template;
    }
    public void insertRecord(String patientId,String fullName, String password, String emailId, String address, String ailment, String description, String dOB, String gender, int contact, String nationality)
    {
    Patient patient=new Patient(patientId,fullName,password,emailId,address,ailment,description,dOB,gender,contact,nationality);
    template.save(patient);
    JOptionPane.showMessageDialog(null,"RECORD INSERTED SUCCESSFULLY !!");
    List<Patient> list=template.find("from Patient where patientId=?",patientId);
    if(list.isEmpty()){
    JOptionPane.showMessageDialog(null,"RECORD NOT FOUND !!");
    }
    else{
        
//    JOptionPane.showMessageDialog(null, list+"\n");
    JOptionPane.showMessageDialog(null,"ID:"+patient.getPatientId()+"\n"+"PASSWORD:"+contact);
    }
    }
    public void insertRecordNurse(String nurseId,String password, String fullName, String emailId, String address, String qualification, String experience, String gender, String dOB, int contact)
    {
    Nurse nurse=new Nurse(nurseId,password, fullName, emailId, address, qualification, experience, gender, dOB, contact);
    template.save(nurse);
    JOptionPane.showMessageDialog(null,"RECORD INSERTED SUCCESSFULLY !!");
    List<Nurse> list=template.find("from Nurse where contact=?",contact);
    if(list.isEmpty()){
    JOptionPane.showMessageDialog(null,"RECORD NOT FOUND !!");
    }
    else{
        
//    JOptionPane.showMessageDialog(null, list+"\n");
    JOptionPane.showMessageDialog(null,"ID:"+nurse.getNurseId()+"\n"+"PASSWORD:"+password);
    }
    }
    public void insertRecordDoctor(String doctorId,String fullName, String password, String emailId, String address, String qualification, String experience, String achievements, String post, String gender, String dOB, int contact)
    {
    Doctor doctor=new Doctor(doctorId,fullName, password, emailId, address, qualification, experience, achievements, post, gender, dOB, contact);
    template.save(doctor);
    JOptionPane.showMessageDialog(null,"RECORD INSERTED SUCCESSFULLY !!");
    List<Doctor> list=template.find("from Doctor where contact=?",contact);
    if(list.isEmpty()){
    JOptionPane.showMessageDialog(null,"RECORD NOT FOUND !!");
    }
    else{
        
//    JOptionPane.showMessageDialog(null, list+"\n");
    JOptionPane.showMessageDialog(null,"ID:"+doctor.getDoctorId()+"\n"+"PASSWORD:"+password);
    }
    }
    @SuppressWarnings("Convert2Lambda")
    public void deleteRecord(int id){
    template.execute(new HibernateCallback<Object>(){
        @Override
        public Object doInHibernate(Session sn) throws HibernateException, SQLException {
        Patient patient=(Patient)sn.get(Patient.class ,id);  
        if(patient==null){
            JOptionPane.showMessageDialog(null,"RECORD NOT FOUND TO DELETE !!");
        }
        else{
        sn.delete(patient);
        JOptionPane.showMessageDialog(null,"RECORD DELETED !!");
        }
            return null;
    }
    });
   }
    public void showAllRecords(){
        List <Patient> list=template.find("from Patient");
        for(int i=0;i<list.size();i++){
        JOptionPane.showMessageDialog(null, list.get(i));
        }
    }
    public boolean checkAdminLogin(String id,String pass)
    {
        List <Admin> list=template.find("from Admin where aId=? and aPass=?",id,pass);
        if(list.isEmpty()){
             return false;
            }
        else{
            return true;
        }
    }
    public boolean checkLogin(String id,String pass,String user){
    if(user.equalsIgnoreCase("patient")){
        List <Patient> list=template.find("from Patient where patientId=? and password=?",id,pass);
        if(list.isEmpty()){
             return false;
            }
        else{
            return true;
        }
    }
    else if(user.equalsIgnoreCase("nurse")){
        List <Nurse> list=template.find("from Nurse where nurseId=? and password=?",id,pass);
        if(list.isEmpty()){
             return false;
            }
        else{
            return true;
        }
    }
    else if(user.equalsIgnoreCase("doctor")){
        List <Doctor> list=template.find("from Doctor where doctorId=? and password=?",id,pass);
        if(list.isEmpty()){
             return false;
            }
        else{
            return true;
        }
    }
    else if(user.equalsIgnoreCase("canteen")){
        List <CanteenOperatorLogin> list=template.find("from CanteenOperatorLogin where cId=? and cPass=?",id,pass);
        if(list.isEmpty()){
             return false;
            }
        else{
            return true;
        }
    }
    else if(user.equalsIgnoreCase("pharmacy")){
        List <PharmacyOperatorLogin> list=template.find("from PharmacyOperatorLogin where pId=? and pPass=?",id,pass);
        if(list.isEmpty()){
             return false;
            }
        else{
            return true;
        }
    }
    else{
    return false;
    }
    }

    public void updateAdminPassword(String id, String npass) 
    {
      template.execute(new HibernateCallback<Object>(){
          @Override
          public Object doInHibernate(Session sn) throws HibernateException, SQLException {
           Admin admin=(Admin)sn.get(Admin.class,id);
           admin.setaPass(npass);
           sn.update(admin);
              return null;
           
          }
      
      });
    }
    
    public void createOperatorLogin(String id,String password,String user)
    {
    if (user.equalsIgnoreCase("pharmacy operator")){
    PharmacyOperatorLogin pol=new PharmacyOperatorLogin(id,password);
    template.save(pol);
    }
    else if(user.equalsIgnoreCase("canteen operator")){
    CanteenOperatorLogin col=new CanteenOperatorLogin(id,password);
    template.save(col);
    }
    }
    
   
    public void addItem(String item,int price)
    {
    CanteenOperator co=new CanteenOperator(item,price);
    template.save(co);
    }
    
    public void updateProfileDoctor(String doctorId,String fullName, String password, String emailId, String address, String qualification, String experience, String achievements, String post, String gender, String dOB, int contact){
    template.execute(new HibernateCallback <Object>(){
        @Override
        public Object doInHibernate(Session sn) throws HibernateException, SQLException {
           Doctor dc=(Doctor)sn.get(Doctor.class,doctorId);
           dc.setAchievements(achievements);
           dc.setAddress(address);
           dc.setContact(contact);
           dc.setEmailId(emailId);
           dc.setExperience(experience);
           dc.setFullName(fullName);
           dc.setGender(gender);
           dc.setPassword(password);
           dc.setPost(post);
           dc.setQualification(qualification);
           dc.setdOB(dOB);
           sn.update(dc);
            return null;
           
        }
    });
    }
        
    public void updateProfileNurse(String nurseId,String password, String fullName, String emailId, String address, String qualification, String experience, String gender, String dOB, int contact){
    template.execute(new HibernateCallback <Object>(){
        @Override
        public Object doInHibernate(Session sn) throws HibernateException, SQLException {
           Nurse dc=(Nurse)sn.get(Nurse.class,nurseId);
           dc.setAddress(address);
           dc.setContact(contact);
           dc.setEmailId(emailId);
           dc.setExperience(experience);
           dc.setFullName(fullName);
           dc.setGender(gender);
           dc.setPassword(password);
           dc.setQualification(qualification);
           dc.setdOB(dOB);
           sn.update(dc);
            return null;
           
        }
        
    });
    }
    
    public void updateReportPatient(String patientId,String fullName,String ailment, String description){
    template.execute(new HibernateCallback <Object>(){
        @Override
        public Object doInHibernate(Session sn) throws HibernateException, SQLException {
           Patient dc=(Patient)sn.get(Patient.class,patientId);
           dc.setFullName(fullName);
           dc.setDescription(description);
           dc.setAilment(ailment);
           sn.update(dc);
            return null;
           
        }  
    });
    }
    public void updateOrderStatus(int id){
    template.execute(new HibernateCallback <Object>(){
        @Override
        public Object doInHibernate(Session sn) throws HibernateException, SQLException {
           DigitalCanteen dc=(DigitalCanteen)sn.get(DigitalCanteen.class,id);
           dc.setStatus("COMPLETED !!");
           sn.update(dc);
            return null;
           
        }  
    });
    }
    
    public void updateMedStatus(int id){
    template.execute(new HibernateCallback <Object>(){
        @Override
        public Object doInHibernate(Session sn) throws HibernateException, SQLException {
           DigitalPharmacy dc=(DigitalPharmacy)sn.get(DigitalPharmacy.class,id);
           dc.setStatus("COMPLETED !!");
           sn.update(dc);
            return null;
           
        }  
    });
    }
    
    public List getProfileInfoDoctor(String id){
        List<Doctor> list= template.find("from Doctor where doctorId=?",id);
        return list;
}
    public List getOrderFood(){
        List<CanteenOperator> list= template.find("from CanteenOperator");
        return list;
}
    
  public List viewOrderFood(){
        List<DigitalCanteen> list= template.find("from DigitalCanteen where status=?","pending");
        return list;
}
    public List getOrderMed(){
        List<DigitalPharmacy> list= template.find("from DigitalPharmacy where status=?","pending");
        return list;
}
    
    public List getProfileInfoNurse(String id){
        List<Nurse> list= template.find("from Nurse where nurseId=?",id);
        return list;
}
        public List getProfileInfoPatient(String id){
        List<Patient> list= template.find("from Patient where patientId=?",id);
        return list;
}
 public void insertOrderMed(String medicineDescription, String fullName, String ward, String status)
    {
     DigitalPharmacy dp=new DigitalPharmacy(medicineDescription,fullName,ward,status);
    template.save(dp);
    }
  public void insertOrderFood(String foodName, int quantity, String fullName, String userId, String ward, String status)
    {
     DigitalCanteen dc=new DigitalCanteen(foodName,quantity,userId,fullName,ward,status);
    template.save(dc);
    } 
  
  public void deleteAccount(String id,String password,String user){
  template.execute(new HibernateCallback<Object>(){
      @Override
      public Object doInHibernate(Session sn) throws HibernateException, SQLException {
        if(user.equalsIgnoreCase("patient")){
        Patient pt=(Patient)sn.get(Patient.class,id);
        sn.delete(pt);
        }
        else if(user.equalsIgnoreCase("doctor")){
        Doctor dt=(Doctor)sn.get(Doctor.class,id);
        sn.delete(dt);
        }
        else if(user.equalsIgnoreCase("nurse")){
        Nurse ns=(Nurse)sn.get(Nurse.class,id);
        sn.delete(ns);
        }
          return null;
        
      }
  
  });
  }
  
}
