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
		}
		
		//Input fuction
		void Nhap () {
			cout << "Nhap ma so: ";
			cin >> Ma_So;
			cout << "Nhap ho ten: ";
			cin >> Ho_Ten;
			cout << "Nhap luong: ";
			cin >> luong;
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


class HANH_CHINH : public NGUOI {
	protected:
		double heSoLuong, luongCoBan, phuCap;
	public:
		HANH_CHINH (string Ma_So, string Ho_Ten, double luong, double heSoLuong, double luongCoBan, double phuCap) : NGUOI(Ma_So, Ho_Ten, luong) {
			this->heSoLuong = heSoLuong;
			this->luongCoBan = luongCoBan;
			this->phuCap = phuCap;
			this->luong = heSoLuong*luongCoBan + phuCap;
		}
};
class LAM_CA : public NGUOI {
	protected:
		int soCa;
		double tienCong, tienAn, phuCapDocHai;
	public:
		LAM_CA (string Ma_So, string Ho_Ten, double luong, int soCa, double tienCong, double tienAn, double phuCapDocHai) : NGUOI(Ma_So, Ho_Ten, luong) {
			this->soCa = soCa;
			this->tienCong = tienCong ;
			this->tienAn = tienAn;
			this->phuCapDocHai = phuCapDocHai;
			this->luong = soCa*tienCong + phuCapDocHai + tienAn;
		}
		
		void NhapLC () {
			Nhap();
		}
};

vector <NGUOI> v;
void nhapDT (int m) {
	NGUOI a;
	for (int i = 0; i < m; i+=1) {
		a.Nhap();
		v.push_back(a);
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
			NGUOI temp = v[i];
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
//	a.setLuong(32);
//	b.setLuong(23);
////	cout << NGUOI::tongSo1;
////	bool c = a>b;
////	LAM_CA* d = new LAM_CA("aa", "bb", 0,3, 10, 22, 4);
////	cout << d->getLuong();
//	nhapDT(3);
////	cout << v[0].getMa_So();
//	quickSort(0, v.size());
//	inDT(3);
	LAM_CA *a = (LAM_CA*)new NGUOI;
	a->Nhap();
	a->setHo_Ten("a");
	a->NhapLC();
	cout << a->getHo_Ten();
	cout << NGUOI::tongSo1;
}
