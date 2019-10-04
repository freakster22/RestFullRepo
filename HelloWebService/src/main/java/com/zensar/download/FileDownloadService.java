package com.zensar.download;

import java.io.File;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.ResponseBuilder;


@Path("/download")
public class FileDownloadService {
	
	private static final String textFile="C:\\Users\\TRG.PLATOW42L0247\\Desktop\\ARIB\\CSSAssignment.txt";
	private static final String imageFile="C:\\Users\\TRG.PLATOW42L0247\\Desktop\\ARIB\\well.jpg";
	
	@GET
	@Path("/text")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getTextFile() {
		File file = new File(textFile);
		ResponseBuilder builder = Response.ok(file);
		builder.header("Content-Disposition","attachment;fileName= text1.txt");
		return builder.build();
	}
	
	@GET
	@Path("/img")
	@Produces("image/jpg")
	public Response getImgFile() {
		File imgFile = new File(imageFile);
		ResponseBuilder builder = Response.ok(imgFile);
		builder.header("Content-Disposition","attachment;fileName= image.jpg");
		return builder.build();
	}
	
	private static final String pdfFile="C:\\Users\\TRG.PLATOW42L0247\\Downloads\\Report.pdf";
	@GET
	@Path("/pdf")
	@Produces("application/pdf")
	public Response getpdfFile() {
		File pdFile = new File(imageFile);
		ResponseBuilder builder = Response.ok(pdFile);
		builder.header("Content-Disposition","attachment;fileName= funds.pdf");
		return builder.build();
	}
}
