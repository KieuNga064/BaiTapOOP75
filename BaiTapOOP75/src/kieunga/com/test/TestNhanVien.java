package kieunga.com.test;

import java.text.DecimalFormat;
import java.util.Scanner;

import kieunga.com.model.NhanVien;

public class TestNhanVien {

	public static void main(String[] args) {
		NhanVien nv1;
		NhanVien nv2;
		System.out.println("Mời bạn nhập vào hai nhân viên. ");
		System.out.println("Nhân viên 1:");
		System.out.print("Họ: ");
		String ho1=new Scanner(System.in).next();
		System.out.print("Tên: ");
		String ten1=new Scanner(System.in).next();
		System.out.print("Số sản phẩm: ");
		int soSP1=new Scanner(System.in).nextInt();
		System.out.println("Nhân viên 2:");
		System.out.print("Họ: ");
		String ho2=new Scanner(System.in).next();
		System.out.print("Tên: ");
		String ten2=new Scanner(System.in).next();
		System.out.print("Số sản phẩm: ");
		int soSP2=new Scanner(System.in).nextInt();
		nv1=new NhanVien(ho1, ten1, soSP1);
		nv2=new NhanVien(ho2, ten2, soSP2);
		System.out.println("Lương nhân viên 1: "+nv1.getLuong());
		System.out.println("Lương nhân viên 2: "+nv2.getLuong());
		int hieu=nv1.getSoSP()-nv2.getSoSP();		
		if(nv1.lonHon(nv2)==true)
			System.out.println("Số sản phẩm nhân viên "+nv1.getTen()+" nhiều hơn nhân viên "+nv2.getTen()+": "+hieu);
		else
			System.out.println("Số sản phẩm nhân viên "+nv2.getTen()+" nhiều hơn nhân viên "+nv1.getTen()+": "+(-hieu));
		System.out.println("Cách 2");
		if(hieu>0)
			System.out.println("Số sản phẩm nhân viên "+nv1.getTen()+" nhiều hơn nhân viên "+nv2.getTen()+": "+hieu);
		else
			System.out.println("Số sản phẩm nhân viên "+nv2.getTen()+" nhiều hơn nhân viên "+nv1.getTen()+": "+(-hieu));
	}

}
