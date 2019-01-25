<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
    <meta http-equiv="Cache-Control" content="no-siteapp" />
    <link rel="Bookmark" href="/favicon.ico" >
    <link rel="Shortcut Icon" href="/favicon.ico" />
    <!--[if lt IE 9]>
    <script type="text/javascript" src="lib/html5shiv.js"></script>
    <script type="text/javascript" src="lib/respond.min.js"></script>
    <![endif]-->
    <link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
    <link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
    <link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />
    <!--[if IE 6]>
    <script type="text/javascript" src="lib/DD_belatedPNG_0.0.8a-min.js" ></script>
    <script>DD_belatedPNG.fix('*');</script>
    <![endif]-->
    <!--/meta 作为公共模版分离出去-->

    <title>新建网站角色 - 管理员管理</title>
</head>
<body>
<article class="page-container">
    <form action="updateSmallSystems" method="post"  class="form form-horizontal" id="form-admin-role-add">
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>权限名称：</label>

            <div class="formControls col-xs-8 col-sm-9">
                <input type="text" class="input-text" value="<c:if test="${not empty requestScope.updateSystemlist[0].headSystem}">${requestScope.updateSystemlist[0].headSystem}</c:if>" placeholder="" id="roleName" name="roleName">
            </div>

        </div>
        <div class="row cl">
            <label class="form-label col-xs-4 col-sm-3">角色：</label>
            <div class="formControls col-xs-8 col-sm-9">

                <%--添加权限节点--%>
                <c:if test="${not empty requestScope.setSystem}">


                
                <c:forEach items="${requestScope.setSystem}" var="headsystem">
                    <c:if test="${headsystem.systemFid==0}">
                <dl class="permission-list">
                    <dt>

                        <label>
                            <input type="checkbox" value="${headsystem.systemId}" name="user-Character-0" id="user-Character-0">
                            <c:if test="${headsystem.systemFid==0}">
                            ${headsystem.systemName}
                            </c:if>
                        </label>

                    </dt>
                    <c:if test="${headsystem.systemFid==0}">
                        <c:forEach items="${requestScope.setSystem}" var="bodys">

                            <c:if test="${bodys.systemFid==headsystem.systemId}">
                    <dd>
                        <dl class="cl permission-list2">
                            <dt>

                                <label class="">
                                    <input type="checkbox" value="${bodys.systemId}" name="user-Character-0-0" id="user-Character-0-0">
                                       ${bodys.systemName}
                                </label>

                            </dt>
                        </dl>
                    </dd>
                        </c:if>
                        </c:forEach>
                    </c:if>
                </dl>
                    </c:if>
                </c:forEach>
                </c:if>



                    <%--编辑权限节点--%>
                    <c:if test="${not empty requestScope.updateSystemlist}">



               <c:forEach items="${requestScope.updateSystemlist}" var="update">
                   <c:if test="${update.type==1}">

                       <input type="hidden" name="systemId" value="${update.system_id}"/>
                    <dl class="permission-lists">
                        <dd>
                            <dl class="cl permission-lists2">
                                <dt>

                                    <label class="">
                                        <input type="checkbox"   checked="checked"  value="${update.system_id}" name="user-Character-0-0" id="user-Character-0-0">
                                        <input type="hidden" name="type" value="${update.type}"/>
                                            ${update.system_name}
                                    </label>

                                </dt>
                            </dl>
                        </dd>
                    </dl>
                   </c:if>

                   <c:if test="${update.type==0}">

                       <input type="hidden" name="systemId" value="${update.system_id}"/>
                       <dl class="permission-lists">
                           <dd>
                               <dl class="cl permission-lists2">
                                   <dt>

                                       <label class="">
                                           <input type="checkbox"   value="${update.system_id}" name="user-Character-0-0" id="user-Character-0-0">
                                           <input type="hidden" name="type" value="${update.type}"/>
                                       ${update.system_name}
                                       </label>

                                   </dt>
                               </dl>
                           </dd>
                       </dl>

                   </c:if>
                      </c:forEach>
                    </c:if>


            </div>
        </div>
        <div class="row cl">
            <div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
                <button type="submit" class="btn btn-success radius" id="admin-role-save" name="admin-role-save"><i class="icon-ok"></i> 确定</button>
            </div>
        </div>
    </form>
</article>

<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script>
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.min.js"></script>
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.js"></script> <!--/_footer 作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/jquery.validation/1.14.0/jquery.validate.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/validate-methods.js"></script>
<script type="text/javascript" src="lib/jquery.validation/1.14.0/messages_zh.js"></script>
<script type="text/javascript">
    $(function(){

        $(".permission-list dt input:checkbox").click(function(){
            $(this).closest("dl").find("dd input:checkbox").prop("checked",$(this).prop("checked"));
        });


        $(".permission-list2 dt input:checkbox").click(function(){
            var l =$(this).parent().parent().find("input:checked").length;
            var l2=$(this).parents(".permission-list").find(".permission-list2 dt").find("input:checked").length;

            if($(this).prop("checked")){

                $(this).closest("dl").find("dt input:checkbox").prop("checked",true);
                $(this).parents(".permission-list").find("dt").first().find("input:checkbox").prop("checked",true);
            }
            else{

                if(l==0){
                    $(this).closest("dl").find("dt input:checkbox").prop("checked",false);
                }
                // if(l2==0){
                //     $(this).parents(".permission-list").find("dt").first().find("input:checkbox").prop("checked",false);
                // }
            }
        });



        $(".permission-lists dt input:checkbox").click(function(){
            $(this).closest("dl").find("dd input:checkbox").prop("checked",$(this).prop("checked"));
        });


        $(".permission-lists2 dt input:checkbox").click(function(){
            var l =$(this).parent().parent().find("input:checked").length;
            var l2=$(this).parents(".permission-lists").find(".permission-lists2 dt").find("input:checked").length;


            if($(this).prop("checked")){

                $(this).closest("dl").find("dt input:checkbox").prop("checked",true);
                $(this).parents(".permission-lists").find("dt").first().find("input:checkbox").prop("checked",true);
                var typetrueValue=$(this).parents(".permission-lists").find("dt").first().find("input:hidden").val();
                if (typetrueValue==0) {
                    $(this).parents(".permission-lists").find("dt").first().find("input:hidden").attr("value",1)
                }
                if(typetrueValue==1){
                    $(this).parents(".permission-lists").find("dt").first().find("input:hidden").attr("value",0);
                }
            }
            else{

                if(l==0){
                    $(this).closest("dl").find("dt input:checkbox").prop("checked",false);
                    var typefalseValue=$(this).parents(".permission-lists").find("dt").first().find("input:hidden").val();

                    if (typefalseValue==0) {
                        $(this).parents(".permission-lists").find("dt").first().find("input:hidden").attr("value",1)
                    }
                    if(typefalseValue==1){
                        $(this).parents(".permission-lists").find("dt").first().find("input:hidden").attr("value",0);
                    }
                }

            }
        });






        $("#form-admin-role-add").validate({
            rules:{
                roleName:{
                    required:true,
                },
            },
            onkeyup:false,
            focusCleanup:true,
            success:"valid",
            submitHandler:function(form){
                $(form).ajaxSubmit();
                var index = parent.layer.getFrameIndex(window.name);
                parent.layer.close(index);

            }
        });
    });

</script>
<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>