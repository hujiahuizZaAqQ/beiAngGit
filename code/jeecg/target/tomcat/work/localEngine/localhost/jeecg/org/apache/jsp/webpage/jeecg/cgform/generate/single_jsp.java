package org.apache.jsp.webpage.jeecg.cgform.generate;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;
import org.jeecgframework.web.cgform.common.CgAutoListConstant;

public final class single_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList(2);
    _jspx_dependants.add("/context/mytags.jsp");
    _jspx_dependants.add("/WEB-INF/tld/easyui.tld");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction.release();
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
 
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path;

      out.write('\n');
      //  c:set
      org.apache.taglibs.standard.tag.rt.core.SetTag _jspx_th_c_005fset_005f0 = (org.apache.taglibs.standard.tag.rt.core.SetTag) _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.SetTag.class);
      _jspx_th_c_005fset_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fset_005f0.setParent(null);
      // /context/mytags.jsp(9,0) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setVar("webRoot");
      // /context/mytags.jsp(9,0) name = value type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fset_005f0.setValue(basePath);
      int _jspx_eval_c_005fset_005f0 = _jspx_th_c_005fset_005f0.doStartTag();
      if (_jspx_th_c_005fset_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
        return;
      }
      _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.reuse(_jspx_th_c_005fset_005f0);
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title>智能表单-代码生成</title>\n");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/cgform/js/cgformField.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"plug-in/cgform/js/fileTree.js\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("function browseFolder(path) {\n");
      out.write("    try {\n");
      out.write("        var Message = \"\\u8bf7\\u9009\\u62e9\\u6587\\u4ef6\\u5939\"; //选择框提示信息\n");
      out.write("        var Shell = new ActiveXObject(\"Shell.Application\");\n");
      out.write("        var Folder = Shell.BrowseForFolder(0, Message, 64, 17); //起始目录为：我的电脑\n");
      out.write("        if (Folder != null) {\n");
      out.write("            Folder = Folder.items(); // 返回 FolderItems 对象\n");
      out.write("            Folder = Folder.item(); // 返回 Folderitem 对象\n");
      out.write("            Folder = Folder.Path; // 返回路径\n");
      out.write("            if (Folder.charAt(Folder.length - 1) != \"\\\\\") {\n");
      out.write("                Folder = Folder + \"\\\\\";\n");
      out.write("            }\n");
      out.write("            document.getElementById(path).value = Folder;\n");
      out.write("            return Folder;\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    catch (e) {\n");
      out.write("        alert(e.message);\n");
      out.write("    }\n");
      out.write("   }\n");
      out.write("   \n");
      out.write("</script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(".table-list {\n");
      out.write("\tmargin: 0;\n");
      out.write("\twidth: auto;\n");
      out.write("\tmargin-left: 0px;\n");
      out.write("\tmargin-right: 0px;\n");
      out.write("\toverflow: hidden;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".table-list td,.table-list th {\n");
      out.write("\ttext-align: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".t_table {\n");
      out.write("\toverflow: auto; /*让内容表格外面的div自动有滚动条*/\n");
      out.write("\tmargin-left: 0px;\n");
      out.write("\tmargin-right: 0px;\n");
      out.write("\twidth: auto;\n");
      out.write("\tmax-height: 240px;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body style=\"overflow-y: hidden; overflow-x: hidden;\" scroll=\"no\">\n");
      if (_jspx_meth_t_005fformvalid_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("</body>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_t_005fbase_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:base
    org.jeecgframework.tag.core.easyui.BaseTag _jspx_th_t_005fbase_005f0 = (org.jeecgframework.tag.core.easyui.BaseTag) _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.get(org.jeecgframework.tag.core.easyui.BaseTag.class);
    _jspx_th_t_005fbase_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fbase_005f0.setParent(null);
    // /webpage/jeecg/cgform/generate/single.jsp(8,0) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui,tools");
    int _jspx_eval_t_005fbase_005f0 = _jspx_th_t_005fbase_005f0.doStartTag();
    if (_jspx_th_t_005fbase_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.reuse(_jspx_th_t_005fbase_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fformvalid_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:formvalid
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_005fformvalid_005f0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_005fformvalid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fformvalid_005f0.setParent(null);
    // /webpage/jeecg/cgform/generate/single.jsp(57,0) name = formid type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setFormid("formobj");
    // /webpage/jeecg/cgform/generate/single.jsp(57,0) name = dialog type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setDialog(true);
    // /webpage/jeecg/cgform/generate/single.jsp(57,0) name = usePlugin type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setUsePlugin("password");
    // /webpage/jeecg/cgform/generate/single.jsp(57,0) name = layout type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setLayout("table");
    // /webpage/jeecg/cgform/generate/single.jsp(57,0) name = tiptype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setTiptype("1");
    // /webpage/jeecg/cgform/generate/single.jsp(57,0) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setAction("generateController.do?dogenerate");
    int _jspx_eval_t_005fformvalid_005f0 = _jspx_th_t_005fformvalid_005f0.doStartTag();
    if (_jspx_eval_t_005fformvalid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cgFormHeadPage.id}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t<input id=\"tableName\" name=\"tableName\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cgFormHeadPage.tableName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\">\n");
        out.write("\t<input type=\"hidden\" id=\"fieldRowNum\" name=\"fieldRowNum\" value=\"1\">\n");
        out.write("\t<table cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">代码生成目录: </label></td>\n");
        out.write("\t\t\t<td class=\"value\"><input type=\"text\" class=\"inputxt\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${projectPath }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" name=\"projectPath\" id=\"projectPath\" datatype=\"*\" /> <a href=\"#\" id=\"openFoldSelect\" class=\"easyui-linkbutton\"\n");
        out.write("\t\t\t\ticon=\"icon-search\" onclick=\"openFolder('projectPath')\">浏览</a></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\">代码分层风格: </label></td>\n");
        out.write("\t\t\t<td class=\"value\"><select name=\"packageStyle\">\n");
        out.write("\t\t\t\t<option value=\"service\">业务分层</option>\n");
        out.write("\t\t\t\t<option value=\"project\">代码分层</option>\n");
        out.write("\t\t\t</select>\n");
        out.write("\t\t\t</td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 数据模型: </label></td>\n");
        out.write("\t\t\t<td class=\"value\"><select id=\"jformType\" disabled=\"disabled\" name=\"jformType\">\n");
        out.write("\t\t\t\t<option value=\"1\" ");
        if (_jspx_meth_c_005fif_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write(">单表</option>\n");
        out.write("\t\t\t\t<option value=\"2\" ");
        if (_jspx_meth_c_005fif_005f1(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write(">一对多</option>\n");
        out.write("\t\t\t</select></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 表名: </label></td>\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\"><input disabled=\"disabled\" class=\"inputxt\" id=\"tableName_tmp\" name=\"tableName_tmp\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cgFormHeadPage.tableName}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" datatype=\"*\"> <span\n");
        out.write("\t\t\t\tclass=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 功能说明: </label></td>\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\"><input class=\"inputxt\" id=\"ftlDescription\" name=\"ftlDescription\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cgFormHeadPage.content}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" datatype=\"*\"> <span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 包名(小写): </label></td>\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\"><input class=\"inputxt\" id=\"entityPackage\" name=\"entityPackage\" datatype=\"*\"> <span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 实体类名(首字母大写): </label></td>\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\"><input class=\"inputxt\" id=\"entityName\" name=\"entityName\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${entityNames[cgFormHeadPage.tableName]}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\" datatype=\"*\"> <span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 需要生成的代码: </label></td>\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\"><input type=\"checkbox\" value=\"1\" name=\"actionFlag\" id=\"actionFlag\" checked=\"checked\">Action</input> <input type=\"checkbox\" value=\"1\" name=\"jspFlag\" id=\"jspFlag\"\n");
        out.write("\t\t\t\tchecked=\"checked\">Jsp</input> <input type=\"checkbox\" value=\"1\" name=\"serviceIFlag\" id=\"serviceIFlag\" checked=\"checked\">ServiceI</input> <input type=\"checkbox\" value=\"1\" name=\"serviceImplFlag\"\n");
        out.write("\t\t\t\tid=\"serviceImplFlag\" checked=\"checked\">ServiceImpl</input> <input type=\"checkbox\" value=\"1\" name=\"pageFlag\" id=\"pageFlag\" checked=\"checked\">Page</input> <input type=\"checkbox\" value=\"1\"\n");
        out.write("\t\t\t\tname=\"entityFlag\" id=\"entityFlag\" checked=\"checked\">Entity</input> <span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t\t<tr>\n");
        out.write("\t\t\t<td align=\"right\"><label class=\"Validform_label\"> 页面风格: </label></td>\n");
        out.write("\t\t\t<td class=\"value\" colspan=\"3\">\n");
        out.write("\t\t\t<select id=\"jspMode\" name=\"jspMode\">\n");
        out.write("\t\t     \t\t");
        if (_jspx_meth_c_005fforEach_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\t\t     </select>\n");
        out.write("\t\t\t<span class=\"Validform_checktip\"></span></td>\n");
        out.write("\t\t</tr>\n");
        out.write("\t</table>\n");
        int evalDoAfterBody = _jspx_th_t_005fformvalid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fformvalid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005ftiptype_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/jeecg/cgform/generate/single.jsp(78,22) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cgFormHeadPage.jformType eq '1' || cgFormHeadPage.jformType eq '3'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
    if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected='selected'");
        int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fif_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/jeecg/cgform/generate/single.jsp(79,22) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${cgFormHeadPage.jformType eq '2'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null, false)).booleanValue());
    int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
    if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write(" selected=\"selected\"");
        int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/jeecg/cgform/generate/single.jsp(110,9) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/webpage/jeecg/cgform/generate/single.jsp(110,9) '${jspModeList }'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${jspModeList }",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /webpage/jeecg/cgform/generate/single.jsp(110,9) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("style");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t     \t <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${style.code }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write(' ');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${style.desc }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t     \t");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
