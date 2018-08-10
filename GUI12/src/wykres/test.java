package wykres;

import java.awt.Graphics;

import javax.script.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.script.*;
import javax.swing.*;

public class test {

	public static void main(String[] args) {
		String s = "2x-1";
		quickMathz(s);

	}

	public static void quickMathz(String s) {
		
		
		ArrayList<String> last = new ArrayList<String>();
		last.add(s);
		
		Matcher minus = Pattern.compile("-[Xx]").matcher(last.get(0));
		if(minus.find()) {
			String temp = last.get(0).replaceAll("-x", "-1x");
			last.set(0, temp);
		}
		
		Matcher plus = Pattern.compile("\\+[Xx]").matcher(last.get(0));
		if(plus.find()) {
			String temp = last.get(0).replaceAll("\\+x", "+1x");
			last.set(0, temp);
		}
				
		Matcher power = Pattern.compile("[+-]?\\d+[Xx]\\^\\d").matcher(last.get(0));
		Matcher multix = Pattern.compile("[+-]?\\d+[Xx][+-]").matcher(last.get(0));
		Matcher endval = Pattern.compile("[+-]\\d+$").matcher(last.get(0));
		
		ArrayList<Integer> values = new ArrayList<Integer>();

	
		while (power.find()) {
			String temp = power.group(0);
			Matcher fi = Pattern.compile("^[+-]?\\d").matcher(temp);
			fi.find();
			values.add(Integer.parseInt(fi.group()));
		}

		while (multix.find()) {
			String temp = multix.group();
			Matcher fi = Pattern.compile("^[+-]?\\d").matcher(temp);
			fi.find();
			values.add(Integer.parseInt(fi.group()));
		}

		while (endval.find()) {
			values.add(Integer.parseInt(endval.group()));
		}

		for (int i = 0; i < values.size(); i++) {
			System.out.println(values.get(i));
		}

	}
}