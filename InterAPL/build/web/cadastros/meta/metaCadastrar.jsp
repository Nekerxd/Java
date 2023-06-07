<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="iso-8859-1"%>
<jsp:include page="/header.jsp"/>
<jsp:include page="/menu.jsp"/>

    <!-- Page Heading -->
    <div class="row">
        <div class="col-12">
            <div class="page-title-box">
                <h4 class="page-title float-left">Meta</h4>
                <ol class="breadcrumb float-right">
                    <li class="breadcrumb-item">
                        <a href="${pageContext.request.contextPath}/">Home</a>
                    </li>
                    <li class="breadcrumb-item">
                        <a href="${pageContext.request.contextPath}/MetaListar">Metas</a>
                    </li>
                    <li class="breadcrumb-item">Cadastro</li>
                </ol>
                    <div class="clearfix"></div>
            </div>
        </div>
    </div>
                    
    <div class="card shadow mb-4">
        <div class="card-header py-3">
            <h6 class="m-0 font-weight-bold text-primary">Cadastro</h6>
        </div>
        <div class="card-body">
            <form name="cadastrarmeta" action="MetaCadastrar" method="POST">
                <div class="form-row">
                    <input type="hidden" class="form-control descricao" id="idmeta" name="idmeta"
                               required value="${meta.idMeta}">
                    <div class="form-group col-md-4">
                        <label for="descmeta" class="col-form-label">Meta:</label>
                        <input type="text" class="form-control descricao" id="descmeta" name="descmeta"
                               required value="${meta.descMeta}">
                    </div>
                    <div class="form-group col-md-4">
                        <label for="tipometa" class="col-form-label">Tipo:</label>
                        <input type="text" class="form-control descricao" id="tipometa" name="tipometa"
                               required value="${meta.tipoMeta}" style="text-transform: uppercase">
                    </div>
                    <div class="form-group col-md-4">
                        <label for="valormeta" class="col-form-label">Valor:</label>
                        <input type="number" class="form-control descricao" id="valormeta" name="valormeta"
                               required value="${meta.valorMeta}">
                    </div>
                    <div class="form-group col-md-2">
                        <label for="prazometa" class="col-form-label">Prazo:</label>
                        <input type="date" class="form-control descricao" id="prazometa" name="prazometa"
                               required value="${meta.prazoMeta}">
                    </div>
                    <div class="form-group col-md-2">
                        <label for="idusuario" class="col-form-label">Usuario</label>
                        <select class="form-control fct" name="idusuario" id="idusuario">
                            <option value="">Selecione</option>
                            <c:forEach var="usuario" items="${usuarios}">
                                <option value="${usuario.idUsuario}" 
                                    ${meta.usuario.idUsuario == usuario.idUsuario ? "selected" : ""}>
                                    ${usuario.nomeUsuario}
                                </option>
                            </c:forEach>
                        </select>
                    </div>
                </div>
                <div class="form-group">        
                    <button type="submit" class="btn btn-success navbar-btn" id="submit"><i class="fa fa-floppy-o" aria-hidden="true"></i> Salvar </button>
                    <button type="reset" class="btn btn-danger navbar-btn" id="reset"><i class="fa fa-floppy-o" aria-hidden="true"></i> Limpar</button>
                    <button class="btn btn-warning navbar-btn">
                        <a href="${pageContext.request.contextPath}/MetaListar" class="btn-warning" style="text-decoration: none">Cancelar</a>
                    </button> 
                </div>
            </form>
        </div>
    </div>

<%@include file="/footer.jsp"%>
