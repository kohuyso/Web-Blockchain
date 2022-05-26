#include <bits/stdc++.h> 
using namespace std;

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
		}
		
		//Destructor
		~NGUOI () {	
			tongSo1 -= 1;	
		}
		
		//Input fuction
		void Nhap () {
			string maso;
			cout << "Nhap ma so: ";
			fflush(stdin);
			getline(cin, Ma_So);
			cout << "Nhap ho va ten: ";
			fflush(stdin);
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
			cout << "Nhap thong tin nhan vien hanh chinh\n";
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
			cout << "Nhap thong tin nhan vien lam theo ca\n";
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



vector <NHAN_VIEN> v;
void nhapDT (int m) {
	int kind;
	NHAN_VIEN z;
	for (int i = 0; i < m; i+=1) {
		cout << "\nNhap loai nhan vien.(1: Hanh Chinh, 2: Lam Ca): ";
		cin >> kind;
		z.loaiNV(kind);
		v.push_back(z);
	}
}
void inDT (int m) {
//	for (int i = 0; i <= 15; i+=1) {
//		cout << "======";
//	}
//	cout << "\n";
//	cout << setw(5) << "STT" << setw(5) << "||" << setw(12) << "Ma ho so" << setw(5) << "||" << setw(18) << "Ho va ten" << setw(10) << "||" << setw(15) << "Luong" << setw(10) << "||";
//	cout << "\n";
//	for (int i = 0; i <= 15; i+=1) {
//		cout << "======";
//	}
//	cout << "\n";
//	for (int i = 0; i < m; i+=1) {
//		cout << "   " << i+1  << setw(15) << v[i].getMa_So() << setw(20) << v[i].getHo_Ten() << setw(27) << v[i].getLuong() << "\n";
//	}

    cout << "\n                              Danh sach nhan vien                     \n";
    cout << "===================================================================================\n";
    cout << "|  STT  |  Ma ho so  |    Ho va ten    |    Luong    |\n";
    cout << "===================================================================================\n";

    for (int i = 0; i<m; i+=1) {
//       printf("| %-10d | %-10s | %-10s | %-9lf |\n", i, v[i].getMa_So(), v[i].getHo_Ten(), v[i].getLuong());
		cout << "    " << i+1 << "       " << v[i].getMa_So() << "           " << v[i].getHo_Ten() << "            " << v[i].getLuong() << "\n";
        cout << "-----------------------------------------------------------------------------------\n";
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
//	//Cau 1: Da hoan thanh o class NGUOI
//	cout << "Cau 1: Da hoan thanh o class nguoi\n\n\n";
//	
//	// Cau 2
	NGUOI a;
	NGUOI b;
//	cout << "Cau 2: Tong so doi tuong hien tai la: " << NGUOI::tongSo1 << "\n\n\n";
//	
	//Cau 3
	//Goi ham setluong() de truyen gia tri cho bien luong cua 2 doi tuong a, b
//	a.setLuong(50);
//	b.setLuong(40);
//	bool c = a > b;
//	cout << "Cau 3: So sanh luong giua 2 doi tuong: " << c << "\n\n\n";
//	
	//Cau 4
//	cout << "Cau 4:\n"
//	HANH_CHINH hc1;
//	hc1.nhapHC();
//	cout << "\nLuong cua nhan vien hanh chinh: " <<hc1.getLuong() << "\n";
//	
//	LAM_CA lc1;
//	lc1.nhapLC();
//	cout << "Luong cua nhan vien lam theo ca: " << lc1.getLuong() << "\n\n\n";
	
	//Cau 5
	cout << "Cau 5: \n";
	int m;
	cout << "Nhap so nhan vien can nhap: ";
	cin >> m;
	nhapDT(m);
	quickSort(0, m-1);
	cout << "\nBang danh sach nhan vien:\n\n";
	inDT(m);
	
//
//	NHAN_VIEN nv;
//	nv.nhapHC();
//	cout << nv.getHo_Ten() << nv.getMa_So();

}
