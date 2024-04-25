'use client'

import { useRouter } from "next/navigation"
import { DataGrid } from '@mui/x-data-grid';
import { useState, useEffect } from "react"
import { Box, Button, Input } from '@mui/material';
import { useSelector, useDispatch } from 'react-redux'
import { NextPage } from "next";
import { findAllArticles } from "@/app/components/article/service/article-service";
import { getAllArticles } from "@/app/components/article/service/article-slice";
import ArticleColumns from "@/app/components/article/module/article-columns";
import { PG } from "@/app/components/common/enums/PG";
import MoveButton from "@/app/atoms/button/MoveButton";
// import React from "react";


const ArticleListPage: NextPage = ({ data }: any) => {
  const dispatch = useDispatch()
  const allArticles: [] = useSelector(getAllArticles)

  useEffect(() => {
    dispatch(findAllArticles(1))
  }, [])

  return (<>
    <h2>게시글 목록</h2>
    <Box sx={{ height: 400, width: '100%' }}>
      {allArticles && <DataGrid
        rows={allArticles}
        columns={ArticleColumns()}
        initialState={{
          pagination: {
            paginationModel: {
              pageSize: 5,
            },
          },
        }}
        pageSizeOptions={[5]}
        checkboxSelection
        disableRowSelectionOnClick
      />}
    </Box>
    <MoveButton text={'수정'} path={'/'}/>
    <MoveButton text={'삭제'} path={'/'}/>
    <MoveButton text={'글쓰기'} path={`${PG.ARTICLE}/save`}/>
  </>)
}

export default ArticleListPage