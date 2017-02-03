package com.asia.frete.relatoriodefretev03;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class item implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   private int nr_item;
   private java.util.Date dt_vencto;
   private java.math.BigDecimal vl_real;
   private java.math.BigDecimal vl_taxa;
   private java.math.BigDecimal taxa_dolar;
   private java.math.BigDecimal valor_dolar;

   @org.kie.api.definition.type.Label("Codigo da Taxa")
   private String codigo_da_taxa;

   public item()
   {
   }

   public int getNr_item()
   {
      return this.nr_item;
   }

   public void setNr_item(int nr_item)
   {
      this.nr_item = nr_item;
   }

   public java.util.Date getDt_vencto()
   {
      return this.dt_vencto;
   }

   public void setDt_vencto(java.util.Date dt_vencto)
   {
      this.dt_vencto = dt_vencto;
   }

   public java.math.BigDecimal getVl_real()
   {
      return this.vl_real;
   }

   public void setVl_real(java.math.BigDecimal vl_real)
   {
      this.vl_real = vl_real;
   }

   public java.math.BigDecimal getVl_taxa()
   {
      return this.vl_taxa;
   }

   public void setVl_taxa(java.math.BigDecimal vl_taxa)
   {
      this.vl_taxa = vl_taxa;
   }

   public java.math.BigDecimal getTaxa_dolar()
   {
      return this.taxa_dolar;
   }

   public void setTaxa_dolar(java.math.BigDecimal taxa_dolar)
   {
      this.taxa_dolar = taxa_dolar;
   }

   public java.math.BigDecimal getValor_dolar()
   {
      return this.valor_dolar;
   }

   public void setValor_dolar(java.math.BigDecimal valor_dolar)
   {
      this.valor_dolar = valor_dolar;
   }

   public java.lang.String getCodigo_da_taxa()
   {
      return this.codigo_da_taxa;
   }

   public void setCodigo_da_taxa(java.lang.String codigo_da_taxa)
   {
      this.codigo_da_taxa = codigo_da_taxa;
   }

   public item(int nr_item, java.util.Date dt_vencto,
         java.math.BigDecimal vl_real, java.math.BigDecimal vl_taxa,
         java.math.BigDecimal taxa_dolar, java.math.BigDecimal valor_dolar,
         java.lang.String codigo_da_taxa)
   {
      this.nr_item = nr_item;
      this.dt_vencto = dt_vencto;
      this.vl_real = vl_real;
      this.vl_taxa = vl_taxa;
      this.taxa_dolar = taxa_dolar;
      this.valor_dolar = valor_dolar;
      this.codigo_da_taxa = codigo_da_taxa;
   }

}