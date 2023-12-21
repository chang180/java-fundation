package com.neweb.chapter16.google_cloud_vision_api;

import com.google.cloud.vision.v1.*;
import com.google.protobuf.ByteString;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class VisionHelp {
    public void analysisPicture(String inputDir, String outputDir) throws Exception {
        ImageAnnotatorClient vision = ImageAnnotatorClient.create();
        List<AnnotateImageRequest> requests = new ArrayList<AnnotateImageRequest>();

        File input = new File(inputDir);
        String[] inputFileNames = input.list();
        for (String inputName : inputFileNames) {
            String fileName = inputDir + "\\" + inputName;

            Path path = Paths.get(fileName);
            byte[] data = Files.readAllBytes(path);
            ByteString imgBytes = ByteString.copyFrom(data);

            Image img = Image.newBuilder().setContent(imgBytes).build();
            Feature feat = Feature.newBuilder().setType(Feature.Type.LABEL_DETECTION).build();

            AnnotateImageRequest request = AnnotateImageRequest.newBuilder().addFeatures(feat).setImage(img).build();
            requests.add(request);
        }

        List<List<String[]>> dataList = new ArrayList<List<String[]>>();

        BatchAnnotateImagesResponse response = vision.batchAnnotateImages(requests);
        List<AnnotateImageResponse> responses = response.getResponsesList();
        for (AnnotateImageResponse res : responses) {
            if (res.hasError()) {
                System.out.printf(res.getError().getMessage());
                return;
            }

            List<String[]> datas = new ArrayList<String[]>();
            for (EntityAnnotation annotation : res.getLabelAnnotationsList()) {
                String[] data = new String[2];
                data[0] = annotation.getDescription();
                data[1] = String.valueOf(annotation.getScore());

                datas.add(data);
            }
            dataList.add(datas);
        }
        writeData(outputDir, inputFileNames, dataList);
    }

    public void writeData(String outDir, String[] inputFileNames, List<List<String[]>> dataList) {

    }
}
