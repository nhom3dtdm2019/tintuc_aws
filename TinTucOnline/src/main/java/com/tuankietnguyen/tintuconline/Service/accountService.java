package com.tuankietnguyen.tintuconline.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.tuankietnguyen.tintuconline.Model.Categori;
import com.tuankietnguyen.tintuconline.Model.LasteVideo;
import com.tuankietnguyen.tintuconline.Model.Trending;
import com.tuankietnguyen.tintuconline.Model.popular;
import com.tuankietnguyen.tintuconline.dao.CategoriRepository;
import com.tuankietnguyen.tintuconline.dao.lastedVideoRepository;
import com.tuankietnguyen.tintuconline.dao.popularRepository;
import com.tuankietnguyen.tintuconline.dao.trendingRepository;

@Service
@Transactional
public class accountService {

	private final trendingRepository trendRepository;
	private final popularRepository popularRe;
	private final lastedVideoRepository lastRe;
	private final CategoriRepository cateRe;
	
	public accountService(trendingRepository trendRepository, popularRepository popularRe,lastedVideoRepository lastRe,CategoriRepository cateRe  ) {
	this.trendRepository = trendRepository;
	this.popularRe = popularRe;
	this.lastRe = lastRe;
	this.cateRe = cateRe;
}


	public List<Trending> findAll(){
		List<Trending> trending = new ArrayList<>();
		for(Trending trend : trendRepository.findAll()) {
			trending.add(trend);
		}
		return trending;
	}
	
	public List<popular> findAllpopular(){
		List<popular> popu = new ArrayList<>();
		for(popular po : popularRe.findAll()) {
			popu.add(po);
		}
		return popu;
	}
	
	public List<LasteVideo> findAlllastedVideo(){
		List<LasteVideo> last = new ArrayList<>();
		for(LasteVideo lasted : lastRe.findAll()) {
			last.add(lasted);
		}
		return last;
	}
	
	public List<Categori> findAllCate(){
		List<Categori> categories = new ArrayList<>();
		for(Categori cate : cateRe.findAll()) {
			categories.add(cate);
		}
		return categories;
	}
	public void saveTrend(Trending trend) {
		trendRepository.save(trend);
	}
	public void deleteTrend(int id) {
		trendRepository.deleteById(id);
	}
	public Trending findDetailNewsWithID(int id)
	{
		List<Trending> trs = new ArrayList<Trending>();
		for(Trending tr:trendRepository.findAll()) {
			if(tr.getIdtrend()==id)
			{
				return tr;
			}
		}
		return null;
	}
}
