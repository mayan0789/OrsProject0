<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
</br>
<div class="row">

	<div class="col-md-3"></div>
	<div class="col-md-5">
		<div class="card c1">
			<div class="card-body c1">
				<h3 class="text-center default-text py-3">
				<c:choose>
				<c:when test="${form.id==0}"><s:message code="label.addcourse" /></c:when>
				<c:otherwise><s:message code="label.updatecourse"></s:message></c:otherwise>
				</c:choose>
				</h3>

				<div>
					<c:if test="${error!=null }">
						<div class="alert alert-danger alert-dismissible">
							<button type="button" class="close" data-dismiss="alert">&times;</button>
							<div class="message">
								<i class="nc-icon nc-bell-55"></i>${error}
							</div>
						</div>
					</c:if>

					<c:if test="${success!=null }">
						<div class="alert alert-success alert-dismissible">
							<button type="button" class="close" data-dismiss="alert">&times;</button>
							<div class="message">
								<i class="nc-icon nc-bell-55"></i>${success}
							</div>
						</div>
					</c:if>
				</div>
				<sf:form method="post" modelAttribute="form">
					<sf:hidden path="id" />
					<sf:hidden path="createdBy" />
					<sf:hidden path="modifiedBy" />
					<sf:hidden path="createdDateTime" />
					<sf:hidden path="modifiedDateTime" />

					<sf:label path="name">
						<s:message code="label.name" />
						<span style="color: red;">*</span>
					</sf:label>
					<div class="input-group">

						<div class="input-group-prepend">
							<span class="input-group-text"> <span
								class="fa fa-user-md grey-text"></span>
							</span>
						</div>
						<sf:input path="name" class="form-control"
							placeholder="${enterName}" />
					</div>
					<font color="red"><sf:errors path="name" /></font>
					<br>

					

				<sf:label path="duration">
						<s:message code="label.duration" />
						<span style="color: red;">*</span>
					</sf:label>
					<div class="input-group">

						<div class="input-group-prepend">
							<span class="input-group-text"> <span
								class="fa fa-clock grey-text"></span>
							</span>
						</div>
						<sf:select path="duration" class="form-control">
							<sf:option value="">
								<s:message code="label.selectduration"></s:message>
							</sf:option>
							<sf:options items="${durationList}" />
						</sf:select>
					</div>
					<font color="red"><sf:errors path="duration" /></font>
					<br>

					<sf:label path="description">
						<s:message code="label.description" />
						<span style="color: red;">*</span>
					</sf:label>
					<div class="input-group">

						<div class="input-group-prepend">
							<span class="input-group-text"> <span
								class="fas fa-edit grey-text"></span>
							</span>
						</div>
						<sf:input path="description" class="form-control"
							placeholder="${enterdescription}" />
					</div>
					<font color="red"><sf:errors path="description" /></font>
					<br>
				
			<div>
			<c:choose>
			<c:when test="${form.id==0}">
			<center>
					<button type="submit" class="btn btn-outline-success"
						name="operation" value="Save">
						<s:message code="label.save" />
					</button>
					<button type="submit" class="btn btn-outline-danger"
						name="operation" value="Reset">
						<s:message code="label.reset" />
					</button>
					</center>
				</c:when>
				<c:otherwise>
				<center>
					<button type="submit" class=" btn btn-outline-danger"
						name="operation" value="Update">
						<s:message code="label.update" />
					</button>
					<button type="submit" class=" btn btn-outline-success"
						name="operation" value="Cancel">
						<s:message code="label.cancel" />
					</button>
					</center>
				</c:otherwise>
				</c:choose>
			</div>





			<br> <br>
			<style>
.c1 {
	border-width: 5px;
	border-style: ridge;
	border-radius: 25px;
}
.btn{
padding: 20px;
}
.card{
background-color: #dbbea6e3;
}

</style>
			

			</sf:form>
		</div>
	</div>
</div>
<div class="col-md-4"></div>
</div>
<br>
<br>
