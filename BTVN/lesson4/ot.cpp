#include <bits/stdc++.h> 
using namespace std;

int a1 = 0;
class NGUOI {
	protected:
		string Ma_So, Ho_Ten;
		double luong;
	public:
		static int tongSo1;
		
		//Constructor
		NGUOI (string Ma_So, string Ho_Ten, double luong) {
			this->Ma_So = Ma_So;
			this->Ho_Ten = Ho_Ten;
			this->luong = luong;
			tongSo1 += 1;
		} 
		NGUOI () {
			tongSo1 += 1;
			a1 += 1;
		}
		
		//Destructor
		~NGUOI () {		
		}
		
		//Input fuction
		void Nhap () {
			string maso;
			cout << "Nhap ma so: ";
			cin.ignore();
			getline(cin, Ma_So);
			cout << "Nhap ho va ten: ";
			cin.ignore();
			getline(cin, Ho_Ten);
		}
		
		//Get/Set fuction
		string getMa_So () {
			return this->Ma_So;
		}
		void setMa_So (string Ma_So) {
			this->Ma_So = Ma_So; 
		}
		string getHo_Ten () {
			return this->Ho_Ten;
		}
		void setHo_Ten (string Ho_Ten) {
			this->Ho_Ten = Ho_Ten; 
		}
		double getLuong () {
			return this->luong;
		}
		void setLuong (double luong) {
			this->luong = luong; 
		}
		
	friend bool operator > (NGUOI a, NGUOI b) {
		if (a.getLuong() > b.getLuong()) {
			return true;
		}
		else {
			return false;
		}
	}

};


class HANH_CHINH : virtual public NGUOI {
	protected:
		double heSoLuong, luongCoBan, phuCap;
	public:
		void nhapHC () {
			Nhap();
			cout << "Nhap he so luong: ";
			cin >> heSoLuong;
			cout << "Nhap luong co ban: ";
			cin >> luongCoBan;
			cout << "Nhap phu cap: ";
			cin >> phuCap;
			HANH_CHINH::luong = heSoLuong*luongCoBan + phuCap;
		}
		
};
class LAM_CA : virtual public NGUOI {
	protected:
		int soCa;
		double tienCong, tienAn, phuCapDocHai;
	public:
		void nhapLC () {
			Nhap();
			cout << "Nhap tien cong: ";
			cin >> tienCong;
			cout << "Nhap tien an: ";
			cin >> tienAn;
			cout << "Nhap phu cap doc hai: ";
			cin >> phuCapDocHai;
			double luong = soCa*tienCong + phuCapDocHai + tienAn;
			LAM_CA::setLuong(luong);
		}
};

class NHAN_VIEN: public HANH_CHINH, public LAM_CA {

	public:
		void loaiNV (int kind) {
			if (kind == 1) {
				nhapHC();
			}
			else {
				nhapLC();
			}
		}

};



NHAN_VIEN v[100];
void nhapDT (int m) {
	int kind;
	for (int i = 0; i < m; i+=1) {
		cout << "Nhap loai nhan vien.(1: Hanh Chinh, 2: Lam Ca): ";
		cin >> kind;
		v[i].loaiNV(kind);
	}
}
void inDT (int m) {
	for (int i = 0; i <= 15; i+=1) {
		cout << "======";
	}
	cout << "\n";
	cout << setw(5) << "STT" << setw(5) << "||" << setw(12) << "Ma ho so" << setw(5) << "||" << setw(18) << "Ho va ten" << setw(10) << "||" << setw(15) << "Luong" << setw(10) << "||";
	cout << "\n";
	for (int i = 0; i <= 15; i+=1) {
		cout << "======";
	}
	cout << "\n";
	for (int i = 0; i < m; i+=1) {
		cout << "   " << i+1  << setw(15) << v[i].getMa_So() << setw(20) << v[i].getHo_Ten() << setw(27) << v[i].getLuong() << "\n";
	}
}

void quickSort (int left, int right) {
	int mid = (left+right)/2;
	int i = left, j = right;
	while (i <= j) {
		while (v[i].getLuong() > v[mid].getLuong()) {
			i += 1;
		}
		while (v[j].getLuong() < v[mid].getLuong()) {
			j -= 1;
		}
		if (i <= j) {
			 NHAN_VIEN temp = v[i];
			v[i] = v[j];
			v[j] = temp;
			i += 1;
			j -= 1;
		}
	}
	if (i < right) {
		quickSort(i, right);
	}
	if (j > left) {
		quickSort(left, j);
	}
	
}
int NGUOI::tongSo1 = 0;



int main () {
//	NGUOI a;
//	NGUOI b;
//	cout << a1;
	NHAN_VIEN nv;
	NHAN_VIEN nv1;
	cout << NGUOI::tongSo1;
	nhapDT(2);
//	a.setLuong(32);
//	b.setLuong(23);
////	cout << NGUOI::tongSo1;
////	bool c = a>b;
////	cout << d->getLuong();
//	nhapDT(3);
////	cout << v[0].getMa_So();
//	quickSort(0, v.size());
//	inDT(3);
//	LAM_CA *a = (LAM_CA*)new NGUOI;
//	a->Nhap();
//	a->setHo_Ten("a");
//	a->NhapLC();
//	cout << a->getHo_Ten();
//	cout << NGUOI::tongSo1;
}
