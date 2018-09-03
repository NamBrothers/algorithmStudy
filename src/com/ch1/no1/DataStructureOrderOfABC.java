package com.ch1.no1;

import java.util.ArrayList;
import java.util.List;

public class DataStructureOrderOfABC {
	private List<Data> dataList;

	public DataStructureOrderOfABC() {
		this.dataList = new ArrayList<>();
	}

	public DataStructureOrderOfABC(List<Data> dataList) {
		this.dataList = dataList;
	}

	public void push(Data data) {
		if (data != null && isDataValid(data)) {
			pushDataWithCompare(data);
		}
	}
	
	public void push(String name, String phoneNo) {
		if (isDataValid(name) && isDataValid(phoneNo)) {
			pushDataWithCompare(name, phoneNo);
		}
	}

	public void push(Data[] datas) {
		if (datas != null) {
			for (Data data : datas) {
				if (isDataValid(data)) {
					pushDataWithCompare(data);
				}
			}
		}

	}

	public Data getFirstData(String name) {
		if (dataList == null || dataList.size() == 0)
			return null;

		for (int i = 0; i < dataList.size(); i++) {
			Data data = dataList.get(i);
			if (isNameExists(data.getName(), name))
				return data;
		}

		return null;
	}

	public Data getLastData(String name) {
		if (dataList == null || dataList.size() == 0)
			return null;

		for (int i = dataList.size() - 1; i >= 0; i--) {
			Data data = dataList.get(i);
			if (isNameExists(data.getName(), name))
				return data;
		}

		return null;
	}

	public Data[] getDatas(String name) {
		if (dataList == null || dataList.size() == 0)
			return null;

		List<Data> searchList = new ArrayList<>();
		for (int i = 0; i < dataList.size(); i++) {
			Data data = dataList.get(i);
			if (isNameExists(data.getName(), name))
				searchList.add(data);
		}

		if (searchList.size() > 0)
			return searchList.toArray(new Data[searchList.size()]);
		else
			return null;
	}

	public String getFirstPhoneNo(String name) {
		if (dataList == null || dataList.size() == 0)
			return null;

		for (int i = 0; i < dataList.size(); i++) {
			Data data = dataList.get(i);
			if (isNameExists(data.getName(), name))
				return data.getPhoneNo();
		}

		return null;
	}

	public String getLastPhoneNo(String name) {
		if (dataList == null || dataList.size() == 0)
			return null;

		for (int i = dataList.size() - 1; i >= 0; i--) {
			Data data = dataList.get(i);
			if (isNameExists(data.getName(), name))
				return data.getPhoneNo();
		}

		return null;
	}

	public String[] getPhoneNos(String name) {
		if (dataList == null || dataList.size() == 0)
			return null;

		List<String> searchList = new ArrayList<>();
		for (int i = 0; i < dataList.size(); i++) {
			Data data = dataList.get(i);
			if (isNameExists(data.getName(), name))
				searchList.add(data.getPhoneNo());
		}

		if (searchList.size() > 0)
			return searchList.toArray(new String[searchList.size()]);
		else
			return null;
	}

	public List<Data> getDataList() {
		return dataList;
	}
	
	private void pushDataWithCompare(Data data){
		if(dataList.size() == 0) {
			dataList.add(data);
			return;
		} else {
			int i = 0;
			for(Data tmp : dataList) {
				if(tmp.getName().compareTo(data.getName()) > 0) {
					dataList.add(i, data);
					break;
				} else
					i++;
			}
		}
	}
	
	private void pushDataWithCompare(String name, String phoneNo){
		if(dataList.size() == 0) {
			dataList.add(new Data(name, phoneNo));
			return;
		} else {
			int i = 0;
			for(Data tmp : dataList) {
				if(tmp.getName().compareTo(name) > 0) {
					dataList.add(i, new Data(name, phoneNo));
					break;
				} else
					i++;
			}
		}
	}
	
	private boolean isDataValid(Data data) {
		if ((data.getName() != null && !data.getName().isEmpty())
				&& (data.getPhoneNo() != null && !data.getPhoneNo().isEmpty()))
			return true;
		else
			return false;
	}

	private boolean isDataValid(String data) {
		if (data != null && !data.isEmpty())
			return true;
		else
			return false;
	}
	
	private boolean isNameExists(String originName, String searchName) {
		if (originName.equals(searchName)
				|| originName.trim().equals(searchName)
				|| originName.trim().replaceAll(" ", "").equals(searchName)
				|| searchName.trim().equals(originName.trim())
				|| searchName.trim().equals(originName.trim().replaceAll(" ", ""))
				|| searchName.trim().replaceAll(" ", "").equals(originName)
				|| searchName.trim().replaceAll(" ", "").equals(originName.trim())
				|| searchName.trim().replaceAll(" ", "").equals(originName.trim().replaceAll(" ", "")))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "DataStructureOrderOfABC [dataList=" + dataList + "]";
	}
}
