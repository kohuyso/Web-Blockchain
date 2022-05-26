//#include <bits/stdc++.h>
//using namespace std;
//int n;
//int noteCol[100] = {0}, noteRow[100] = {0};
//int matrix[100][100] = {0};
//int plusX[8] = {2, 2, 1, 1, -1, -1, -2, -2};
//int plusY[8] = {1, -1, 2, -2, 2, -2, 1, -1};
//
//
//void in () {
//	for (int i = 1; i <= n; i+=1) {
//		for (int j = 1; j <= n; j+=1) {
//			cout << matrix[i][j] << " ";
//		}
//		cout << "\n";
//	}
//	cout << "\n";
//}
//
//int counta = 2;
//int dq (int x, int y) {
//	for (int i = 0; i < 8; i+=1) {
//		int tempx = x + plusX[i];
//		int tempy = y +	plusY[i];
//		if (matrix[tempx][tempy] == 0 && tempx > 0 && tempx <= n && tempy > 0 && tempy <= n) {
//			matrix[tempx][tempy] = counta;
//			if (counta < n*n) {
//				counta += 1;
//				dq (tempx, tempy);
//				counta -= 1;
//				matrix[tempx][tempy] = 0;
//			}
//			else {
//				in();
//			}
//		}
//	}
//}
//
//int main () {
//	cin >> n;
//	matrix[2][3] = 1;
//	dq(2, 3);
//}

#include <bits/stdc++.h>
using namespace std;



class HoaDon{
	private:
		string SHD, tenHang;
		double tien;
	
	public:
		HoaDon (string SHD, string tenHang, double tien) {
			this -> SHD = SHD;
			this -> tenHang = tenHang;
			this -> tien = tien;
		}
    
    	string getSHD() {
			return SHD;
    	}
		string gettenHang() {
			return tenHang;
    	}
		double gettien() {
			return tien;
    	}
    	void setSHD(string SHD) {
    		this->SHD = SHD;
		}
		void setTenHang(string tenHang) {
    		this->tenHang = tenHang;
		}
		void setTien(double tien) {
    		this->tien = tien;
		}
};


class Node {
	public:
		HoaDon* data;
		Node* next;
		
		Node () {
			data = 0;
			next = NULL;
		}
		
		Node (HoaDon* data) {
			this -> data = data;
			this -> next = NULL;
		}
};

class LinkedList {
	public:
		Node* head;
		Node* tail;
		LinkedList () {
			head = NULL;
		}
		
		void insert(HoaDon *data) {
			Node* node = new Node (data);
			
			if (head == NULL) {
				head = node;
				tail = node;
				return;
			}
			else {
				tail->next = node;
				tail = node;
			}
		}
		
		void deletexoa (string xoa) {
			Node *temp1 = head, *temp2 = NULL;
		  
		    if (head == NULL) {
		        cout << "List empty" << endl;
		        return;
		    }
		  
		    if (xoa == head->data->getSHD()) {
		        head = head->next;
		        delete temp1;
		        return;
		    }
		    
		    while (temp1 -> next != NULL) {
		        if (temp1->data->getSHD() != xoa) {
					temp2 = temp1;
		       		temp1 = temp1->next;
				}
				else {
					break;
				}
		    }

		    temp2->next = temp1->next;
		  
		    delete temp1;
		}
		
		void print () {
			Node* temp = head;
			
		    if (head == NULL) {
		        cout << "List empty" << endl;
		        return;
		    }
		  
		    while (temp != NULL) {
		        cout << temp->data->getSHD() << " ";
		        temp = temp->next;
		   	}
		}
		
		void duyet () {
			Node* temp = head;
			double tongTien = 0;
			int n;
			while (temp != NULL) {
				tongTien += temp->data->gettien();
				n += 1;
				temp = temp->next;
			}
			cout << "Tong tien: " << tongTien << "\n";
			cout << "So luong hoa don: " << n << "\n";
		}
		
		void sortList () {
			Node* tempi = head;
			Node* tempj;
			while (tempi != NULL) {
				tempj = tempi->next;
				while (tempj != NULL) {
					if (tempi->data->gettien() > tempj->data->gettien()) {
						string swM = tempi->data->getSHD(); string swT = tempi->data->gettenHang(); double swTien = tempi->data->gettien();
						tempi->data->setSHD(tempj->data->getSHD()); tempi->data->setTenHang(tempj->data->gettenHang()); tempi->data->setTien(tempj->data->gettien());
						tempj->data->setSHD(swM); tempj->data->setTenHang(swT); tempj->data->setTien(swTien);
					}
					tempj = tempj->next;
				}
				tempi = tempi->next;
			}
		}

};
 	

int main () {
	LinkedList* ll = new LinkedList();
	HoaDon* hoadon1 = new HoaDon("1", "Hang 1", 2.2);
	HoaDon* hoadon2 = new HoaDon("2", "Hang 2", 1.3);
	HoaDon* hoadon3 = new HoaDon("3", "Hang 3", 5.1);
	ll->insert(hoadon1);
	ll->insert(hoadon2);
	ll->insert(hoadon3);
	ll->print();
	cout << "\n";
	ll->sortList();
//	ll->deletexoa("2");
	ll->print();
	
	ll->duyet();
}
