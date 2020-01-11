package com.apache.solr.SolrDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolrDemoApplication {

	// https://data.gov.in/node/6719439

	/*

	College for Professional Education (Engineering & Technology) Students and Teachers in Tiruvannamalai District 2017-18 : DHB 2017-18

SNo,InstitutionName,InstitutionCount,BoysCount,GirlsCount,TotalStudentsCount,TeachersCount,City
1,"University College of Engineering,Arani,A constituent College of Anna University,Chennai",1,533,371,904,54,Arani
2,"Arunai Engineering College,Tiruvannamalai",1,1437,627,2064,163,Tiruvannamalai
3,"SKP Engineering College,Tiruvannamalai",1,1197,494,1691,257,Tiruvannamalai
4,"SKP Institute of Technology,Tiruvannamalai ",1,1197,494,1691,257,Tiruvannamalai
5,"Sri Balji Chokkalingam Engineering College,Arani",1,579,259,838,60,Arani
6,"Arulmigu Meenachi Engineering College,Vadamavanandal",1,371,173,544,52,Vadamavanandal
7,"Tiruvalluvar college of Engineering and Technology,Vandavasi-604505",1,1098,638,1736,120,Vandavasi
8,"Oxford College of Engineering,Venmani,Polur",1,186,42,228,34,Polur
9,"Annamalaiar College of Engineering,Modaiyur,Polur",1,191,109,300,30,Polur
10,"Sri Renugambal college of Architecture,Polur",1,76,82,158,10,Polur
11,"Sri College of Engineering and Technology,Vandavasi",1,220,35,255,54,Vandavasi
12,"Arunai College of Engineering,Tiruvannamalai",1,191,109,300,31,Tiruvannamalai

	 */

	public static void main(String[] args) {
		SpringApplication.run(SolrDemoApplication.class, args);
	}
}
