package com.asia.frete.relatoriodefretev03;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class cliente implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "CLIENTE_ID_GENERATOR")
   @javax.persistence.Id
   @javax.persistence.SequenceGenerator(name = "CLIENTE_ID_GENERATOR", sequenceName = "CLIENTE_ID_SEQ")
   private java.lang.Long id;

   private java.math.BigDecimal cd_cadimp;

   private java.lang.String nm_cadimp;

   private char telefone;

   private java.lang.String des_email;

   public cliente()
   {
   }

   public java.lang.Long getId()
   {
      return this.id;
   }

   public void setId(java.lang.Long id)
   {
      this.id = id;
   }

   public java.math.BigDecimal getCd_cadimp()
   {
      return this.cd_cadimp;
   }

   public void setCd_cadimp(java.math.BigDecimal cd_cadimp)
   {
      this.cd_cadimp = cd_cadimp;
   }

   public java.lang.String getNm_cadimp()
   {
      return this.nm_cadimp;
   }

   public void setNm_cadimp(java.lang.String nm_cadimp)
   {
      this.nm_cadimp = nm_cadimp;
   }

   public char getTelefone()
   {
      return this.telefone;
   }

   public void setTelefone(char telefone)
   {
      this.telefone = telefone;
   }

   public java.lang.String getDes_email()
   {
      return this.des_email;
   }

   public void setDes_email(java.lang.String des_email)
   {
      this.des_email = des_email;
   }

   public cliente(java.lang.Long id, java.math.BigDecimal cd_cadimp,
         java.lang.String nm_cadimp, char telefone,
         java.lang.String des_email)
   {
      this.id = id;
      this.cd_cadimp = cd_cadimp;
      this.nm_cadimp = nm_cadimp;
      this.telefone = telefone;
      this.des_email = des_email;
   }

}