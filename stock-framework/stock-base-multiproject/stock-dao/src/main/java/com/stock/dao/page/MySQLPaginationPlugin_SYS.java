/**************************************************************************
* 项目名称：数联软件 web开发框架                          
***************************************************************************/
package com.stock.dao.page;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.ShellRunner;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;

import java.util.List;

/**
* TODO 请在此处添加注释
* @author dijia.tang
* @version $Id$
* @since 2.0
*/
public class MySQLPaginationPlugin_SYS extends PluginAdapter {

   /**
    * @param topLevelClass
    * @param introspectedTable
    * @return boolean
    * @see PluginAdapter#modelExampleClassGenerated(TopLevelClass, IntrospectedTable)
    */
   @Override
   public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,
           IntrospectedTable introspectedTable) {
       addPage(topLevelClass, introspectedTable, "page");
       return super.modelExampleClassGenerated(topLevelClass,introspectedTable);
   }

   /**
    * @param element
    * @param introspectedTable
    * @return boolean
    * @see PluginAdapter#sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement, IntrospectedTable)
    */
   @Override
   public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(
           XmlElement element, IntrospectedTable introspectedTable) {
       XmlElement page = new XmlElement("if");
       page.addAttribute(new Attribute("test", "page != null"));
       page.addElement(new TextElement("limit #{page.begin} , #{page.length}"));
       element.addElement(page);
       return super.sqlMapUpdateByExampleWithoutBLOBsElementGenerated(element,introspectedTable);
   }

   /**
    * @param topLevelClass
    * @param introspectedTable
    * @param name
    */
   private void addPage(TopLevelClass topLevelClass,
           IntrospectedTable introspectedTable, String name) {
       topLevelClass.addImportedType(new FullyQualifiedJavaType("com.stock.dao.page.Page"));
       CommentGenerator commentGenerator = context.getCommentGenerator();
       Field field = new Field();
       field.setVisibility(JavaVisibility.PROTECTED);
       field.setType(new FullyQualifiedJavaType("com.stock.dao.page.Page"));
       field.setName(name);
       commentGenerator.addFieldComment(field, introspectedTable);
       topLevelClass.addField(field);
       char c = name.charAt(0);
       String camel = Character.toUpperCase(c) + name.substring(1);
       Method method = new Method();
       method.setVisibility(JavaVisibility.PUBLIC);
       method.setName("set" + camel);
       method.addParameter(new Parameter(new FullyQualifiedJavaType("com.stock.dao.page.Page"), name));
       method.addBodyLine("this." + name + "=" + name + ";");
       commentGenerator.addGeneralMethodComment(method, introspectedTable);
       topLevelClass.addMethod(method);
       method = new Method();
       method.setVisibility(JavaVisibility.PUBLIC);
       method.setReturnType(new FullyQualifiedJavaType("com.stock.dao.page.Page"));
       method.setName("get" + camel);
       method.addBodyLine("return " + name + ";");
       commentGenerator.addGeneralMethodComment(method, introspectedTable);
       topLevelClass.addMethod(method);
   }

   /**
    * This plugin is always valid - no properties are required
    * @param warnings
    * @return boolean
    * @see org.mybatis.generator.api.Plugin#validate(List)
    */
   public boolean validate(List<String> warnings) {
       return true;
   }

   /**  */
   public static void generate(String resourceXML) {
       String config = MySQLPaginationPlugin_SYS.class.getClassLoader()
               .getResource(resourceXML).getFile();
       String[] arg = { "-configfile", config, "-overwrite" };
       ShellRunner.main(arg);
   }

   /**  */
   public static void main(String[] args) {

//		String resourceXML = "generatorConfig_sys.xml";

       String resourceXML = "generatorConfig_sys.xml";

       generate(resourceXML);
   }
}
