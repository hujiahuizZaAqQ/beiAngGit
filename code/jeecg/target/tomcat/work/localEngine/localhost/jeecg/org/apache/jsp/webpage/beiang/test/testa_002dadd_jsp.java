package org.apache.jsp.webpage.beiang.test;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class testa_002dadd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fdatatype_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fdatatype_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fset_0026_005fvar_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fbase_0026_005ftype_005fnobody.release();
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction.release();
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fdatatype_005fnobody.release();
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
      out.write(" <head>\n");
      out.write("  <title>测试</title>\n");
      out.write("  ");
      if (_jspx_meth_t_005fbase_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("  //编写自定义JS代码\n");
      out.write("  </script>\n");
      out.write(" </head>\n");
      out.write(" <body>\n");
      out.write("  ");
      if (_jspx_meth_t_005fformvalid_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write(" </body>\n");
      out.write("  <script src = \"webpage/beiang.testa/testa.js\"></script>\t\t\n");
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
    // /webpage/beiang/test/testa-add.jsp(7,2) name = type type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fbase_005f0.setType("jquery,easyui,tools,DatePicker");
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
    org.jeecgframework.tag.core.easyui.FormValidationTag _jspx_th_t_005fformvalid_005f0 = (org.jeecgframework.tag.core.easyui.FormValidationTag) _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction.get(org.jeecgframework.tag.core.easyui.FormValidationTag.class);
    _jspx_th_t_005fformvalid_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fformvalid_005f0.setParent(null);
    // /webpage/beiang/test/testa-add.jsp(13,2) name = formid type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setFormid("formobj");
    // /webpage/beiang/test/testa-add.jsp(13,2) name = dialog type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setDialog(true);
    // /webpage/beiang/test/testa-add.jsp(13,2) name = usePlugin type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setUsePlugin("password");
    // /webpage/beiang/test/testa-add.jsp(13,2) name = layout type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setLayout("table");
    // /webpage/beiang/test/testa-add.jsp(13,2) name = action type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fformvalid_005f0.setAction("testaController.do?doAdd");
    int _jspx_eval_t_005fformvalid_005f0 = _jspx_th_t_005fformvalid_005f0.doStartTag();
    if (_jspx_eval_t_005fformvalid_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("\t\t<input id=\"id\" name=\"id\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${testaPage.id }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\n");
        out.write("\t\t<input id=\"updateDate\" name=\"updateDate\" type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${testaPage.updateDate }", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
        out.write("\"/>\n");
        out.write("\t\t<table style=\"width: 600px;\" cellpadding=\"0\" cellspacing=\"1\" class=\"formtable\">\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t流程状态:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t\t  ");
        if (_jspx_meth_t_005fdictSelect_005f0(_jspx_th_t_005fformvalid_005f0, _jspx_page_context))
          return true;
        out.write("     \n");
        out.write("\t\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">流程状态</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t创建人名称:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t     \t <input id=\"createName\" name=\"createName\" type=\"text\" style=\"width: 150px\" class=\"inputxt\" \n");
        out.write("\t\t\t\t\t     \t  datatype=\"*\" \n");
        out.write("\t\t\t\t\t     \t  ignore=\"checked\"\n");
        out.write("\t\t\t\t\t     \t  />\n");
        out.write("\t\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">创建人名称</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t创建人登录名称:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t     \t <input id=\"createBy\" name=\"createBy\" type=\"text\" style=\"width: 150px\" class=\"inputxt\" \n");
        out.write("\t\t\t\t\t     \t  \n");
        out.write("\t\t\t\t\t     \t  ignore=\"ignore\"\n");
        out.write("\t\t\t\t\t     \t  />\n");
        out.write("\t\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">创建人登录名称</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t更新人名称:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t     \t <input id=\"updateName\" name=\"updateName\" type=\"text\" style=\"width: 150px\" class=\"inputxt\" \n");
        out.write("\t\t\t\t\t     \t  \n");
        out.write("\t\t\t\t\t     \t  ignore=\"ignore\"\n");
        out.write("\t\t\t\t\t     \t  />\n");
        out.write("\t\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">更新人名称</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t更新人登录名称:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t     \t <input id=\"updateBy\" name=\"updateBy\" type=\"text\" style=\"width: 150px\" class=\"inputxt\" \n");
        out.write("\t\t\t\t\t     \t  \n");
        out.write("\t\t\t\t\t     \t  ignore=\"ignore\"\n");
        out.write("\t\t\t\t\t     \t  />\n");
        out.write("\t\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">更新人登录名称</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t所属部门:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t     \t <input id=\"sysOrgCode\" name=\"sysOrgCode\" type=\"text\" style=\"width: 150px\" class=\"inputxt\" \n");
        out.write("\t\t\t\t\t     \t  \n");
        out.write("\t\t\t\t\t     \t  ignore=\"ignore\"\n");
        out.write("\t\t\t\t\t     \t  />\n");
        out.write("\t\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">所属部门</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t所属公司:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t     \t <input id=\"sysCompanyCode\" name=\"sysCompanyCode\" type=\"text\" style=\"width: 150px\" class=\"inputxt\" \n");
        out.write("\t\t\t\t\t     \t  \n");
        out.write("\t\t\t\t\t     \t  ignore=\"ignore\"\n");
        out.write("\t\t\t\t\t     \t  />\n");
        out.write("\t\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">所属公司</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t\t<tr>\n");
        out.write("\t\t\t\t\t<td align=\"right\">\n");
        out.write("\t\t\t\t\t\t<label class=\"Validform_label\">\n");
        out.write("\t\t\t\t\t\t\t创建日期:\n");
        out.write("\t\t\t\t\t\t</label>\n");
        out.write("\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t\t<td class=\"value\">\n");
        out.write("\t\t\t\t\t\t\t   <input id=\"createDate\" name=\"createDate\" type=\"text\" style=\"width: 150px\" class=\"Wdate\" onClick=\"WdatePicker({dateFmt:'yyyy-MM-dd HH:mm:ss'})\" \n");
        out.write("\t\t\t\t\t      \t\t\t\t\t\t \n");
        out.write("\t\t\t\t\t      \t\t\t\t\t\tignore=\"ignore\"\n");
        out.write("\t\t\t\t\t      \t\t\t\t\t\t/>\n");
        out.write("\t\t\t\t\t\t\t<span class=\"Validform_checktip\"></span>\n");
        out.write("\t\t\t\t\t\t\t<label class=\"Validform_label\" style=\"display: none;\">创建日期</label>\n");
        out.write("\t\t\t\t\t\t</td>\n");
        out.write("\t\t\t\t</tr>\n");
        out.write("\t\t\t</table>\n");
        out.write("\t\t");
        int evalDoAfterBody = _jspx_th_t_005fformvalid_005f0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_t_005fformvalid_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fformvalid_0026_005fusePlugin_005flayout_005fformid_005fdialog_005faction.reuse(_jspx_th_t_005fformvalid_005f0);
    return false;
  }

  private boolean _jspx_meth_t_005fdictSelect_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_t_005fformvalid_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  t:dictSelect
    org.jeecgframework.tag.core.easyui.DictSelectTag _jspx_th_t_005fdictSelect_005f0 = (org.jeecgframework.tag.core.easyui.DictSelectTag) _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fdatatype_005fnobody.get(org.jeecgframework.tag.core.easyui.DictSelectTag.class);
    _jspx_th_t_005fdictSelect_005f0.setPageContext(_jspx_page_context);
    _jspx_th_t_005fdictSelect_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_t_005fformvalid_005f0);
    // /webpage/beiang/test/testa-add.jsp(24,9) name = field type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setField("bpmStatus");
    // /webpage/beiang/test/testa-add.jsp(24,9) name = type type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setType("radio");
    // /webpage/beiang/test/testa-add.jsp(24,9) name = typeGroupCode type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setTypeGroupCode("bpm_status");
    // /webpage/beiang/test/testa-add.jsp(24,9) name = defaultVal type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setDefaultVal((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${testaPage.bpmStatus}", java.lang.String.class, (PageContext)_jspx_page_context, null, false));
    // /webpage/beiang/test/testa-add.jsp(24,9) name = hasLabel type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setHasLabel(false);
    // /webpage/beiang/test/testa-add.jsp(24,9) name = title type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setTitle("流程状态");
    // /webpage/beiang/test/testa-add.jsp(24,9) name = datatype type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_t_005fdictSelect_005f0.setDatatype("*");
    int _jspx_eval_t_005fdictSelect_005f0 = _jspx_th_t_005fdictSelect_005f0.doStartTag();
    if (_jspx_th_t_005fdictSelect_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fdatatype_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005ft_005fdictSelect_0026_005ftypeGroupCode_005ftype_005ftitle_005fhasLabel_005ffield_005fdefaultVal_005fdatatype_005fnobody.reuse(_jspx_th_t_005fdictSelect_005f0);
    return false;
  }
}
